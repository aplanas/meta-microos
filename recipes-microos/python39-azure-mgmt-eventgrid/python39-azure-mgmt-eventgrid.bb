SUMMARY = "Microsoft Azure EventGrid Management Client Library"
DESCRIPTION = "This is the Microsoft Azure EventGrid Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python39-azure-mgmt-eventgrid-10.2.0-1.4.noarch.rpm"
RPM_HASH = "db865c9a72b83de173ac43b1a81e554127bbd838908fcdf6ea5c2d7c519a970d5add091443987633a2bb557dbe7db497bb30a98c5568c3e4de6736c33f063334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-eventgrid) python39-azure-mgmt-eventgrid python3dist(azure-mgmt-eventgrid)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
