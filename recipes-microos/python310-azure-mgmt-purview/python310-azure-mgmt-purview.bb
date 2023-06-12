SUMMARY = "Microsoft Azure Purview Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Purview Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-purview-1.0.0-1.8.noarch.rpm"
RPM_HASH = "6915738b2695f8df8777f78e5efb95b55d7d339ad1e90663753b3cc02a58f089eebf1796f29f18f6b20f3b236af6f10ea22096a7b4a0a1e886bc90ece54d4b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-purview \
python3.10dist(azure-mgmt-purview) \
python310-azure-mgmt-purview \
python3dist(azure-mgmt-purview)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
