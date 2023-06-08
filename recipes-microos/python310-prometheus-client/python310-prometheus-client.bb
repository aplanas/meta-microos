SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python310-prometheus-client-0.16.0-1.3.noarch.rpm"
RPM_HASH = "b754af42fda3713923add904e711e404f4f955d00a179dc9752a8f6c68be2587c6396b4dbb9a14ad6111c04b32b3081d2344223b8bcae2b68f51b4d04e10e546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prometheus-client python3-prometheus_client python3.10dist(prometheus-client) python310-prometheus-client python310-prometheus_client python3dist(prometheus-client)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
