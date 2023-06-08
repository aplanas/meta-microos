SUMMARY = "Microsoft Azure Security Insight Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Security Insight Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-securityinsight-1.0.0.0-1.4.noarch.rpm"
RPM_HASH = "222ed13737fc18144b9f9640c6c0f204ce6dc1535dd776d2f9ba6ca959961ba9e4069cf7022b01436b7d88402b97066112706750f87509dfab443b56b780ac57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-securityinsight python3.10dist(azure-mgmt-securityinsight) python310-azure-mgmt-securityinsight python3dist(azure-mgmt-securityinsight)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
