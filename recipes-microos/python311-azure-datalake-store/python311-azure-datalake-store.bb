SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.0.52"

RPM_NAME = "python311-azure-datalake-store-0.0.52-1.8.noarch.rpm"
RPM_HASH = "d6bf48b0d07ba5ce563a1f6881a5626536f6f21fcadb7767afcf9bf192674412ecedec5bb1d439c739c91bffb6c334ecab997f86f640cea174b170feef589618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-datalake-store) python311-azure-datalake-store python3dist(azure-datalake-store)"
RDEPENDS:${PN} += "python(abi) python311-adal python311-azure-nspkg python311-cffi python311-requests"

inherit rpm
