SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "NCSA"

PV = "0.6.0"

RPM_NAME = "python39-lit-0.6.0-3.9.noarch.rpm"
RPM_HASH = "03e7531cf289e0f163c9539b9b5074538ae5523c79463dadf4c5736288f95224989dbfc8476d235bd529ee295a33f77ad9d768e48cd9ff08176ff4eddd53d641"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit python3.9dist(lit) python39-lit python3dist(lit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) update-alternatives"

inherit rpm
