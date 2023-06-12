SUMMARY = "Microsoft Azure Front Door Service Client Library"
DESCRIPTION = "This is the Microsoft Azure Front Door Service Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-azure-mgmt-frontdoor-1.1.0-1.1.noarch.rpm"
RPM_HASH = "f2594179640cf117cebea8b9107c57043ef7087f7e134d74f527a426abda07d5df511cf9548746a644e9b4ff4e30151888f7fd38d0b960915bb31ca7d1d5d9f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-frontdoor) \
python39-azure-mgmt-frontdoor \
python3dist(azure-mgmt-frontdoor)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
