SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python310-azure-mgmt-cosmosdb-9.2.0-1.1.noarch.rpm"
RPM_HASH = "ce685c41ce2f8a57ed8a0c28a78c69369b16c04c4f89b788ad105800b1c83275f5849f653fbb761b871fbcdef3898bdc6b4f9a9df31fa118b108d01fbd24719d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cosmosdb python3.10dist(azure-mgmt-cosmosdb) python310-azure-mgmt-cosmosdb python3dist(azure-mgmt-cosmosdb)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
