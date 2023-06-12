SUMMARY = "Microsoft Azure SQL Management Client Library"
DESCRIPTION = "This is the Microsoft Azure SQL Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "4.0.0b10"

RPM_NAME = "python39-azure-mgmt-sql-4.0.0b10-1.1.noarch.rpm"
RPM_HASH = "189e8df2d65a3fec3669b50cf981552ceee58eb79ddf357c169af5e961023763a4ec2f5f29755224e608e74fb53c232dae842328e58f88df1bea536ec12db6e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-sql) \
python39-azure-mgmt-sql \
python3dist(azure-mgmt-sql)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-isodate"

inherit rpm
