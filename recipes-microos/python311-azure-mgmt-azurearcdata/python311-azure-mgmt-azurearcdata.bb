SUMMARY = "Microsoft Azure Azurearcdata Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurearcdata Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-azure-mgmt-azurearcdata-1.0.0-1.3.noarch.rpm"
RPM_HASH = "41b72a2c47a0597df33d02be8c735f945bd68da441766f8089d782a7500168ba4770b54bf35ab764a05c06f5a71156a3b850d1d8c50ef5c8cf5a2ef96184651a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-azurearcdata) \
python311-azure-mgmt-azurearcdata \
python3dist(azure-mgmt-azurearcdata)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
