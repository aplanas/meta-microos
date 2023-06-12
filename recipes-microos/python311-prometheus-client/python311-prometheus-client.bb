SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python311-prometheus-client-0.17.0-2.1.noarch.rpm"
RPM_HASH = "46379c8ca1375304e8d7d8ff142a1bffa6a5f32ff8e8f3ca06b10fe1d560eab292e2a5bd3769106a967ad3cccb60a267531bee4c9b38033937343d868c642390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(prometheus-client) python311-prometheus-client python311-prometheus_client python3dist(prometheus-client)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
