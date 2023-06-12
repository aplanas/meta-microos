SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python311-azure-mgmt-hybridcompute-8.0.0-1.2.noarch.rpm"
RPM_HASH = "a76784c8f1d0c1185258acb081a449d9bcea8f56a7153f9c598ca578b0918c213920a963a58c027404e1a6a50b6dc04b3ccce34d59f206b3adafc617560c4661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-hybridcompute) \
python311-azure-mgmt-hybridcompute \
python3dist(azure-mgmt-hybridcompute)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) \
python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
