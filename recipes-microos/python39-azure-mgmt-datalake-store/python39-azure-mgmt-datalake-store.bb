SUMMARY = "Microsoft Azure Data Lake Store Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-datalake-store-1.0.0-1.10.noarch.rpm"
RPM_HASH = "cfe0d0bcbd02e0a741374b7c2592fa69bf680eef59bf63a37d37990e84a34c2678a765476369f62e757ff05d7e36f0413fc497109f793ed4463b6af7a43aa65b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-datalake-store) python39-azure-mgmt-datalake-store python3dist(azure-mgmt-datalake-store)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-datalake-nspkg python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
