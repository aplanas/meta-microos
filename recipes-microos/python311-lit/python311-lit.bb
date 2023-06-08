SUMMARY = "A portable tool for executing test suites"
DESCRIPTION = "Lit is a portable tool for executing LLVM and Clang style test suites, \
summarizing their results, and providing indication of failures. Lit is \
designed to be a lightweight testing tool with as simple a user interface \
as possible/"
LICENSE = "NCSA"

PV = "0.6.0"

RPM_NAME = "python311-lit-0.6.0-3.9.noarch.rpm"
RPM_HASH = "f8b5fc6ffe314a88dc1a57891cc54ab785c0c0108beb26390103bdaef271bbd09757a0c122236c452e83cd6129183f365f232fdaa978e4a5d676134259381734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lit python3.11dist(lit) python311-lit python3dist(lit)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
