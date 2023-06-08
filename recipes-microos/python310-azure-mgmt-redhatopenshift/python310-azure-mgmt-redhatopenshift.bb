SUMMARY = "Microsoft Azure Red Hat Openshift Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Red Hat Openshift Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python310-azure-mgmt-redhatopenshift-1.2.0-1.3.noarch.rpm"
RPM_HASH = "2cf0551ce57fdc1785979cff9746d5cc42a3bffd41ded929fa6b611208fa9286166b7581c254b81a743701a716a04534a45165e06ebc6bdbffbf7ddeecdbe829"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-redhatopenshift python3.10dist(azure-mgmt-redhatopenshift) python310-azure-mgmt-redhatopenshift python3dist(azure-mgmt-redhatopenshift)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
