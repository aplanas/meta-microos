SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-azure-mgmt-frontdoor-1.0.1-1.6.noarch.rpm"
RPM_HASH = "8b0acdef0c604b6b5f204b070d1990f63b671f2d54a9746f04a9e10501168b9fdfc9a5c282bd96213fc51bb687416ffcaa3baa825121b50a52ff281931c555b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-frontdoor python3.10dist(azure-mgmt-frontdoor) python310-azure-mgmt-frontdoor python3dist(azure-mgmt-frontdoor)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
