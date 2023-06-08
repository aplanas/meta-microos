SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b3"

RPM_NAME = "python310-azure-mgmt-resourcehealth-1.0.0b3-1.3.noarch.rpm"
RPM_HASH = "d7e786f5611803a8c3f6971e4cf650e1bd1549d9272d8d1e8c98e101025b4175ae521465ae0e75395d4a90e1a5c772c979cb5bb1fe3ebbb446869ae88e3dc19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcehealth python3.10dist(azure-mgmt-resourcehealth) python310-azure-mgmt-resourcehealth python3dist(azure-mgmt-resourcehealth)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
