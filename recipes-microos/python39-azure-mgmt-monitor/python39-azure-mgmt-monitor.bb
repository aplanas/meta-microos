SUMMARY = "Microsoft Azure Monitor Client Library"
DESCRIPTION = "This is the Microsoft Azure Monitor Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-azure-mgmt-monitor-6.0.1-1.1.noarch.rpm"
RPM_HASH = "3b2c6a9cf808fb37f659cc6c70c096a4630b54af9c088443a8979b6c68b764ae335255981b3856ef80b0dfe3b368f8ed012c74e7f538a81acfe9835a9560888c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-monitor) \
python39-azure-mgmt-monitor \
python3dist(azure-mgmt-monitor)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
