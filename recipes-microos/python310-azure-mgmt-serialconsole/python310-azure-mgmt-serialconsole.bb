SUMMARY = "Microsoft Azure SerialConsole Client Library"
DESCRIPTION = "This is the Microsoft Azure SerialConsole Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-serialconsole-1.0.0.0-1.3.noarch.rpm"
RPM_HASH = "f461add214f7377b2d1966d62196b9d9c012510540d32e3ef3ca617c73236078158b8e44ee6a7ff42e3d026299dcbe63e39d79d13c5d6404ac220ddab8dd967a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-serialconsole \
python3.10dist(azure-mgmt-serialconsole) \
python310-azure-mgmt-serialconsole \
python3dist(azure-mgmt-serialconsole)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
