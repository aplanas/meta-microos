SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python39-prometheus-client-0.16.0-1.3.noarch.rpm"
RPM_HASH = "b3aae1b4b7592882fb3993030bad3803efa5098647b7584d658ebb2b53a78377dd0d930afca305c21799efbae714272d454c7a7a363061b351a90473f542d10d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(prometheus-client) python39-prometheus-client python39-prometheus_client python3dist(prometheus-client)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
