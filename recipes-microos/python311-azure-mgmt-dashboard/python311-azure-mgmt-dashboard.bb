SUMMARY = "Microsoft Azure Dashboard Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Dashboard Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-dashboard-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "3a682f374ecdacaac60bd4f7bb3661913d728978ef70f7e92621959cbaafc7348aaf944d5934931768c405bea3fb537bcfb50c9da4006d6121cbdee0a49f22a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-dashboard) python311-azure-mgmt-dashboard python3dist(azure-mgmt-dashboard)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
