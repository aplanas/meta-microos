SUMMARY = "Distributed Evolutionary Algorithms in Python"
DESCRIPTION = "DEAP is intended to be an easy to use distributed evolutionary algorithm \
library in the Python language. Its two main components are modular and \
can be used separately. The first module is a Distributed Task Manager \
(DTM), which is intended to run on cluster of computers. The second \
part is the Evolutionary Algorithms in Python (EAP) framework."
LICENSE = "LGPL-3.0-only"

PV = "1.3.1"

RPM_NAME = "python310-deap-1.3.1-4.6.aarch64.rpm"
RPM_HASH = "8e9f15bb16e0ec7ca99814d243d6804426e7792b28ba3c803d443c9e76eba182acc2a5eadc4cd488e61820618f3605dc411e8ee7ca682e63eddb91f35e24fe5f"

RPROVIDES:${PN} += "python3-deap python3.10dist(deap) python310-deap python310-deap(aarch-64) python3dist(deap)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
