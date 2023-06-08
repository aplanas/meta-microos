SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-agfood-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "e5dc3115edbaa8ba5dd8d952b9e5bbbccdfac9bbabc6e4889b25a81271934d40415e821c1b28658122f082d6912f6fa827db698ace37646e788e4bd3aeba7cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-agfood python3.10dist(azure-mgmt-agfood) python310-azure-mgmt-agfood python3dist(azure-mgmt-agfood)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
