SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-storagemover-1.0.0-1.2.noarch.rpm"
RPM_HASH = "52bca73f51024c6f5f7866e245cab794b8ea130b8dd9735c2aaf3043dd2f1d05857835270e715f999cab75fcf54921b6ed05a961ed3aa616409d16fea1563020"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-storagemover) python39-azure-mgmt-storagemover python3dist(azure-mgmt-storagemover)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
