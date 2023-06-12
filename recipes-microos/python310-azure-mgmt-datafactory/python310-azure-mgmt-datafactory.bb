SUMMARY = "Microsoft Azure Data Factory Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Factory Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python310-azure-mgmt-datafactory-3.1.0-1.2.noarch.rpm"
RPM_HASH = "4829106c8e011d47b878ca097ce83cbe8684dabd8ae6d8a881c6dfaa9f764b9fa5abd12db7140b1981d2ea6222262daa586f53d0787e06a6f3f4fac5098b5613"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datafactory \
python3.10dist(azure-mgmt-datafactory) \
python310-azure-mgmt-datafactory \
python3dist(azure-mgmt-datafactory)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
