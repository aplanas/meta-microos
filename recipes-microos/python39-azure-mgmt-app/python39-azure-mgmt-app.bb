SUMMARY = "Microsoft Azure App Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure App Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python39-azure-mgmt-app-1.0.0b2-1.5.noarch.rpm"
RPM_HASH = "9e61cb606bbcc2fe132eff7dbaffc97d8cf70892fd503f9d416fe8fd63d19ad03a1cb4899f76f822eaa3261781586920cae9f23bbf7b13f1d378feecd6130069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-app) python39-azure-mgmt-app python3dist(azure-mgmt-app)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
