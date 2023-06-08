SUMMARY = "Microsoft Azure Cosmos DB Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python311-azure-mgmt-cosmosdb-9.1.0-1.1.noarch.rpm"
RPM_HASH = "2e23339d5452921e4886aa779e2421a944b89a096b56b3786e3e86ba48713166f0e1625ce2f52ffa9ffd8430b48c4a358fbc9ddfee23484f3d7ccd6f0cce00ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-cosmosdb) python311-azure-mgmt-cosmosdb python3dist(azure-mgmt-cosmosdb)"
RDEPENDS:${PN} += "(python311-typing_extensions >= 4.3.0 if python311-base < 3.8) python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-isodate"

inherit rpm
