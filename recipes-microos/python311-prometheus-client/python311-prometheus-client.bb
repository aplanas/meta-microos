SUMMARY = "Python client for the Prometheus monitoring system"
DESCRIPTION = "The official Python 2 and 3 client for Prometheus."
LICENSE = "Apache-2.0"

PV = "0.16.0"

RPM_NAME = "python311-prometheus-client-0.16.0-1.3.noarch.rpm"
RPM_HASH = "92181567e7d04314acaf818935da24a080181fde592d2e1319cbd89b4a646d577034c40621dcfabe61d7889abdde69090e8ecd49cb6ba8fcdf0933a32cd37831"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(prometheus-client) python311-prometheus-client python311-prometheus_client python3dist(prometheus-client)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
