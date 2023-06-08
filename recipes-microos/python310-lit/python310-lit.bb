SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "NCSA"

PV = "0.6.0"

RPM_NAME = "python310-lit-0.6.0-3.9.noarch.rpm"
RPM_HASH = "82946de59033de3c41610d7842ed1c4609f8476b847c550a579c3eddca17bb694b3b6b7efc3ff9e200e3af232b655b391436807a2414c2c2499aca8640d48e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit python3-lit python3.10dist(lit) python310-lit python3dist(lit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
