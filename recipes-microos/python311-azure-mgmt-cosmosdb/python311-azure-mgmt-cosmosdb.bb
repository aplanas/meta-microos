SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.2.0"

RPM_NAME = "python311-azure-mgmt-cosmosdb-9.2.0-1.1.noarch.rpm"
RPM_HASH = "9c337a8eb872d3af27f0a5747b7397d60e5d96bb8243b94db1e288444d161f39e276e0696a1027b53ae312e4e12cde7988614e6bc5030a2dce80ff7f0f9e9a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-cosmosdb) python311-azure-mgmt-cosmosdb python3dist(azure-mgmt-cosmosdb)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
