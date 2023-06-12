SUMMARY = "Microsoft Azure Extendedlocation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Extendedlocation Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python311-azure-mgmt-extendedlocation-1.1.0-1.4.noarch.rpm"
RPM_HASH = "5106d3746f42ce695f3c36c6c395cfba559456c307d871d6e1bee3d804028887253351275fcabe0c3bee8c6d7ee7b92156704e6a6b5b70e630faadcba896b209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-extendedlocation) \
python311-azure-mgmt-extendedlocation \
python3dist(azure-mgmt-extendedlocation)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
