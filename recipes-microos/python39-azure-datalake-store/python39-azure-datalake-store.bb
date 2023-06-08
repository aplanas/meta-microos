SUMMARY = "Microsoft Azure Data Lake Store Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Store Client Library. \
 \
Azure Data Lake Store Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "0.0.52"

RPM_NAME = "python39-azure-datalake-store-0.0.52-1.8.noarch.rpm"
RPM_HASH = "9f42514055b63ca41c98e6e5b70b59be6eef8e60bcc3a0cc776b8c4302a78db50c590322384a453790928be624453252a5222181b9029578957a5ebee0a84f31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-datalake-store) python39-azure-datalake-store python3dist(azure-datalake-store)"
RDEPENDS:${PN} += "python(abi) python39-adal python39-azure-nspkg python39-cffi python39-requests"

inherit rpm
