SUMMARY = "Microsoft Azure Mixed Reality Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Mixed Reality Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python310-azure-mgmt-mixedreality-1.0.0b1-2.8.noarch.rpm"
RPM_HASH = "ee7b2b30184394df2baa28933fa2fd761c25922444196e70c191df406337e679587e8bc061e3116aa26d234fe4c0205148cc2d4d2c32d440eb24b097625a949b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mixedreality \
python3.10dist(azure-mgmt-mixedreality) \
python310-azure-mgmt-mixedreality \
python3dist(azure-mgmt-mixedreality)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
