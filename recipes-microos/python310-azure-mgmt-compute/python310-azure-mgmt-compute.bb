SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "30.0.0"

RPM_NAME = "python310-azure-mgmt-compute-30.0.0-1.1.noarch.rpm"
RPM_HASH = "da31af2d10d6b6b63aad1feca2c100e8eddddad4393aa3a9677b4d564f915b63099e17562918bc3ee33ab72263b21fde44b99562d4633e2ff7af0bb731c5fe04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-compute python3.10dist(azure-mgmt-compute) python310-azure-mgmt-compute python3dist(azure-mgmt-compute)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
