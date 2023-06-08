SUMMARY = "Microsoft Azure Resource Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Resource Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "23.0.0"

RPM_NAME = "python311-azure-mgmt-resource-23.0.0-1.2.noarch.rpm"
RPM_HASH = "ff28028cfe0f9ea2c4dc068d50c74b8ad4bcf489a5560f226d70ee1457c32ed737f7d9f88b92cae4503ac2ad111013d0b0bb9868853e81c63c6ca6ff05798647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-resource) python311-azure-mgmt-resource python3dist(azure-mgmt-resource)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
