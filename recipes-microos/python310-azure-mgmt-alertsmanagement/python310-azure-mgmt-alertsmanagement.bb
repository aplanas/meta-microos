SUMMARY = "Microsoft Azure Alerts Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Alerts Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-alertsmanagement-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "2ce579f6081dd38abd60da3c2176af7e000d58dcaec3fca690f79a1fd0a3ed1682221b46d939d4958235090ba413330052147a2979c0fd08c7e8ef16d5cc9d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-alertsmanagement \
python3.10dist(azure-mgmt-alertsmanagement) \
python310-azure-mgmt-alertsmanagement \
python3dist(azure-mgmt-alertsmanagement)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
