SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-mergedeep-1.3.4-2.8.noarch.rpm"
RPM_HASH = "7b50b8274d3cc221cb142a757fa401a6012f6800fa17a1545c26dcc7fb39395b23b8025fc00a7096a34d4fe64cc80b3dd05f4180c0b6c69dd8eede983b3075d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mergedeep python3.10dist(mergedeep) python310-mergedeep python3dist(mergedeep)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
