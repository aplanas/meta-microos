SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python39-azure-mgmt-cosmosdb-9.1.0-1.1.noarch.rpm"
RPM_HASH = "aeaf22c06368109d2bee75749d48e28cde84cc22ea0da52b27f6a45d4bc19358be43568a69b2080f4f4795e5c39ab2c064c880940fe27e7ff626e85372d9d1b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-cosmosdb) python39-azure-mgmt-cosmosdb python3dist(azure-mgmt-cosmosdb)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
