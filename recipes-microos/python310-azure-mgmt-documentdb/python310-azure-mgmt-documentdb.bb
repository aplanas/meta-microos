SUMMARY = "Microsoft Azure DocumentDB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure DocumentDB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.3, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python310-azure-mgmt-documentdb-0.1.3-6.11.noarch.rpm"
RPM_HASH = "cf499a3c3b26d302f50fd890a90fb0d88008666b5fd2b835bf6d4f4fcfe78ceada28008610be437cb34511163e2d657dc089ea42df2db2d2e86d6157bf336788"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-documentdb \
python3.10dist(azure-mgmt-documentdb) \
python310-azure-mgmt-documentdb \
python3dist(azure-mgmt-documentdb)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
