SUMMARY = "Microsoft Azure App Configuration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure App Configuration Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python311-azure-mgmt-appconfiguration-3.0.0-1.2.noarch.rpm"
RPM_HASH = "659f83685da8113f7937b95625bf60049efdc7a42d8494e7fdb565a11b34831a0b64daaf7ab862407d9dcf5b670adceafcc6b2511e86326a8856b0b94e811a47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-appconfiguration) python311-azure-mgmt-appconfiguration python3dist(azure-mgmt-appconfiguration)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
