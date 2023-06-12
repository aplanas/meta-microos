SUMMARY = "Microsoft Azure MyService Management Client Library"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python310-azure-mgmt-appplatform-8.0.0-1.1.noarch.rpm"
RPM_HASH = "cc936f7a174a2d584ef512818fe9c93eb1af71d5adbb66fe43a4805d649cd9d4aabaab2578cb6a3dfa78ab4c7fc9368a059bad23a5d418fd214397c9ea69c266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-appplatform \
python3.10dist(azure-mgmt-appplatform) \
python310-azure-mgmt-appplatform \
python3dist(azure-mgmt-appplatform)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
