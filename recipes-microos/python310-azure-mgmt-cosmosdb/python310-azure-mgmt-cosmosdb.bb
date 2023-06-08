SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python310-azure-mgmt-cosmosdb-9.1.0-1.1.noarch.rpm"
RPM_HASH = "bf125efaac37546a5e58950ac194ccb3f35271ed6f16a8bb6ad4623e132d8b871cb005a1a9b176ad8947ef5d2f528580e093421bfe0974772ae16ad5ca6e744a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-cosmosdb python3.10dist(azure-mgmt-cosmosdb) python310-azure-mgmt-cosmosdb python3dist(azure-mgmt-cosmosdb)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
