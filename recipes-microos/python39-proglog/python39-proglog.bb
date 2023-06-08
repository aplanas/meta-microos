SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.9"

RPM_NAME = "python39-proglog-0.1.9-1.15.noarch.rpm"
RPM_HASH = "a119208ba99b3bde89498ba50c796ef8838ac69866f63ca8d8b04bc7555047471d21bab7d0197b60717d7bdd104c08a2696c6a4dd4fe0b3536ffce569b1bbd61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(proglog) python39-proglog python3dist(proglog)"
RDEPENDS:${PN} += "python(abi) python39-tqdm"

inherit rpm
