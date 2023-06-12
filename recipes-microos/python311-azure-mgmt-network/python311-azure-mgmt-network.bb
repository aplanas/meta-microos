SUMMARY = "Microsoft Azure Network Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Network Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "23.1.0"

RPM_NAME = "python311-azure-mgmt-network-23.1.0-1.1.noarch.rpm"
RPM_HASH = "657fe81eebaf2514f777df39a6806eabe67840a7157b0cc6bd89f5867c0658d019a4f04f0f4ce4511abcea4917f0f40788434ce4e0c55094df4db7b1f078e1d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-network) python311-azure-mgmt-network python3dist(azure-mgmt-network)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
