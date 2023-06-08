SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-securityinsight-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "f21a7b72d16216696e1cabfa5aa3ee87f221f429e4951a01a9010ce1d6d336e4c24a16a215a3fbaf88fb5fde6a6a9138128f9ad4dffdbe3cc48a1237e75eaa07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-securityinsight) python39-azure-mgmt-securityinsight python3dist(azure-mgmt-securityinsight)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
