SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-baremetalinfrastructure-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "330959dc3fd6a3315e44a9c04ca174c260fd8f937dc941ca03a7caffb451dc541a9c3f090a7af9786fb6a8962e7577c29784adef8c481539929b6485de8c8cc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-baremetalinfrastructure python3.10dist(azure-mgmt-baremetalinfrastructure) python310-azure-mgmt-baremetalinfrastructure python3dist(azure-mgmt-baremetalinfrastructure)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
