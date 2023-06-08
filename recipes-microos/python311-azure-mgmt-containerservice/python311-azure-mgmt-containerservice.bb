SUMMARY = "Microsoft Azure Container Service Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Container Service Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "22.1.0"

RPM_NAME = "python311-azure-mgmt-containerservice-22.1.0-1.1.noarch.rpm"
RPM_HASH = "a5d9e012266abfbcf913e41923e17daf21a8dcdc0cdbf56113abaf0f9ee2c16987587d02f929819bb95ccd4ab2ea71081aa31494637671bde5b086f5c775321e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-containerservice) python311-azure-mgmt-containerservice python3dist(azure-mgmt-containerservice)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
