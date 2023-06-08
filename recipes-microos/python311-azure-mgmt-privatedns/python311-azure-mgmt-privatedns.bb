SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-privatedns-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "004e01d5f32196c5d0d45607dcb6bff3c92dda3a1858d103b3cda4371e054929c6ae7e69f6431123222d6350ace456410f73e697058a52e467555bd3cecb1f2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-privatedns) python311-azure-mgmt-privatedns python3dist(azure-mgmt-privatedns)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
