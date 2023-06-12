SUMMARY = "Microsoft Azure Databricks Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Databricks Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-databricks-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "96bce209eef8d93d5daa5d034cb01670382eac06fa33106a1277c2f3df23fbc83f83312a05d8dc4e2a377a67e207543bdd4727185602f3efd7d027f45859d6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databricks \
python3.10dist(azure-mgmt-databricks) \
python310-azure-mgmt-databricks \
python3dist(azure-mgmt-databricks)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
