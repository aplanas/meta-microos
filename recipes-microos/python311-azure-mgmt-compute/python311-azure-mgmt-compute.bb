SUMMARY = "Microsoft Azure Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "29.1.0"

RPM_NAME = "python311-azure-mgmt-compute-29.1.0-1.3.noarch.rpm"
RPM_HASH = "fe85760ed8a9e362be5375f964dcfc422c30e0bd4d47349d47ddc7878f6144845973ada5f5c570f37fc92527b514651d72c14ff812e949c29a465873b231f7ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-compute) python311-azure-mgmt-compute python3dist(azure-mgmt-compute)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
