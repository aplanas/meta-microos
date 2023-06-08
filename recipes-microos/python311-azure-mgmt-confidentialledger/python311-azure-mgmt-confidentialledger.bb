SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-confidentialledger-1.0.0-1.5.noarch.rpm"
RPM_HASH = "203586aae7ef1e132d068fac05711539b2a326da1000e7c2e0161dfe5056b3129b3acab3e19871ec6df391b36e5b292a5d0b4e7ee38ba39a3feb464221e9ec88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-confidentialledger) python311-azure-mgmt-confidentialledger python3dist(azure-mgmt-confidentialledger)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
