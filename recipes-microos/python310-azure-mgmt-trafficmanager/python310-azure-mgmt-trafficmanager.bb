SUMMARY = "Microsoft Azure Traffic Manager Client Library"
DESCRIPTION = "This is the Microsoft Azure Traffic Manager Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-trafficmanager-1.0.0-1.6.noarch.rpm"
RPM_HASH = "b05a8bde9d8f5b10929103f5f4a84fef126ea1e092ca2ed45d106f2f9ad1d4427a93c5d758a6a65440c5bcfecfcb8adee3ad63c945ce9ade1bf8fbc8d35a278d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-trafficmanager python3.10dist(azure-mgmt-trafficmanager) python310-azure-mgmt-trafficmanager python3dist(azure-mgmt-trafficmanager)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
