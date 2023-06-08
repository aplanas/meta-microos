SUMMARY = "Azure DocumentDB Python SDK"
DESCRIPTION = "This is the Microsoft Azure Cosmos DB Python SDK. \
 \
This package has been tested with Python 2.7, 3.3, 3.4 and 3.5."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python310-pydocumentdb-2.3.5-3.11.noarch.rpm"
RPM_HASH = "6b4cec5d9d32fb700bb239cd9d55be9074bcdc5d394afa98bcb9b149867f91ba9a35d4a838bf3fe85f746c4a9e5429ae4bb6c4903fc350a6232e5083883a45a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pydocumentdb python3.10dist(pydocumentdb) python310-pydocumentdb python3dist(pydocumentdb)"
RDEPENDS:${PN} += "python(abi) python310-requests python310-six"

inherit rpm
