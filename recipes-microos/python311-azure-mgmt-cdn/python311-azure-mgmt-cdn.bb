SUMMARY = "Microsoft Azure CDN Management Client Library"
DESCRIPTION = "This is the Microsoft Azure CDN Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "12.0.0"

RPM_NAME = "python311-azure-mgmt-cdn-12.0.0-1.6.noarch.rpm"
RPM_HASH = "5dd7d07eb2d7314e91ebd364c3029770451a8fdb89fb41d21891c058eb3d11417bde1a272c9134413bddc59b5114ff627bf88a9da9f7bf09fde3f1a9b231b103"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-cdn) python311-azure-mgmt-cdn python3dist(azure-mgmt-cdn)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
