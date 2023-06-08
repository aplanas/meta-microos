SUMMARY = "Microsoft Azure Dev Spaces Client Library"
DESCRIPTION = "This is the Microsoft Azure Dev Spaces Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b2"

RPM_NAME = "python311-azure-mgmt-devspaces-1.0.0b2-1.3.noarch.rpm"
RPM_HASH = "ac4a2d5a69fc35a810bd8ba8bb74a6708b9304acd9178cd02f11e4a0916395a651df9ef222996403ca78203b940edd31c220986be9c05c470ca5063a1a80d653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-devspaces) python311-azure-mgmt-devspaces python3dist(azure-mgmt-devspaces)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
