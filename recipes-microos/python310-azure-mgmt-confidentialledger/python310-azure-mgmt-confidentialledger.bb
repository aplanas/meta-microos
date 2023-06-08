SUMMARY = "Microsoft Azure Confidential Ledger Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Confidential Ledger Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-confidentialledger-1.0.0-1.5.noarch.rpm"
RPM_HASH = "af5f9533c1cfe8ff4b5e617281d9003f26213d61bd6394f0a14032e6cd90a7f9ba0e136d63d325a5cbeb94b9d7d5c35af6d707788e57dd1be270860000d498bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-confidentialledger python3.10dist(azure-mgmt-confidentialledger) python310-azure-mgmt-confidentialledger python3dist(azure-mgmt-confidentialledger)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
