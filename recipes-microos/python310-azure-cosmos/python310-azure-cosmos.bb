SUMMARY = "Microsoft Azure Cosmos client library for Python"
DESCRIPTION = "Welcome to the repo containing all things Python for the Azure Cosmos DB API which is published \
with name [azure-cosmos](https://pypi.python.org/pypi/azure-cosmos/). For documentation please \
see the Microsoft Azure [link](https://docs.microsoft.com/en-us/azure/cosmos-db/sql-api-sdk-python)."
LICENSE = "MIT"

PV = "4.3.1"

RPM_NAME = "python310-azure-cosmos-4.3.1-1.2.noarch.rpm"
RPM_HASH = "3ead0b66e4497f584cd07ee2dcb2662c1ab89074514ee43bebd1e87c6eee56661f85e494f471a062ab9bb4e2c2c3ff379a65940dc96b11defe66914a0b33a8e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-cosmos python3.10dist(azure-cosmos) python310-azure-cosmos python3dist(azure-cosmos)"
RDEPENDS:${PN} += "python(abi) python310-azure-core python310-azure-nspkg"

inherit rpm
