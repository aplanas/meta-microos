SUMMARY = "Microsoft Azure Media Services Client Library"
DESCRIPTION = "This is the Microsoft Azure Media Services Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "10.2.0"

RPM_NAME = "python311-azure-mgmt-media-10.2.0-1.3.noarch.rpm"
RPM_HASH = "f6c4eec8b6db3199069884dedf97af7a61413e8ea52043dd41e96a514e273503b90385c32a7638afabb76abe0c5707da9721e031dafd3928a6fbe544d165c0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-media) python311-azure-mgmt-media python3dist(azure-mgmt-media)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
