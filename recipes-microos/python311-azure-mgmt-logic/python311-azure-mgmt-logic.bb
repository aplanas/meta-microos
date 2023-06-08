SUMMARY = "Microsoft Azure Logic Apps Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Logic Apps Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "10.0.0"

RPM_NAME = "python311-azure-mgmt-logic-10.0.0-1.3.noarch.rpm"
RPM_HASH = "afde5b19de4f64b424a788b7ec3c656860d6a931b181542b2c9717c54d745fdd9433f5a6f5847d6ae87768c43c6284d543d7d47dc7177893b34ff8f48fccd4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-logic) python311-azure-mgmt-logic python3dist(azure-mgmt-logic)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
