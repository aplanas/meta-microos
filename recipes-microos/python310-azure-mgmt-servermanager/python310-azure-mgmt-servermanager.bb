SUMMARY = "Microsoft Azure Server Manager Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Server Manager Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-servermanager-2.0.0-4.11.noarch.rpm"
RPM_HASH = "d46e0528ad5fc500b19bce50a9208ffb22b437dfaaaf7dd0fe9207988db4aad29767472c0d6baaecbfd449847aa17dffb0caf46a56d7f171caa81b6c748efb10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servermanager \
python3.10dist(azure-mgmt-servermanager) \
python310-azure-mgmt-servermanager \
python3dist(azure-mgmt-servermanager)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrestazure"

inherit rpm
