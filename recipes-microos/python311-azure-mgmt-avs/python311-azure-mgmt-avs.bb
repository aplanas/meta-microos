SUMMARY = "Microsoft Azure VMware Solution Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure VMware Solution Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "7.1.0"

RPM_NAME = "python311-azure-mgmt-avs-7.1.0-1.3.noarch.rpm"
RPM_HASH = "369579a43552d561530e881cd45790a91ef7548ef12763bd6e2f93c490ff2f67455d75d805f254c964c2b2ed996f4de2eb1fb2c7fe6c06a66b73bdde79390d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-avs) python311-azure-mgmt-avs python3dist(azure-mgmt-avs)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
