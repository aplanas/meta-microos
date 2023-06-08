SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-opt-viewer-14.0.6-8.1.noarch.rpm"
RPM_HASH = "a08f6b923b8318c4f22c2c7979252f380d87e6bc92e01c56a71b70febfc4a699c13c85d8d64bf5fa9af43895e55905048aafaf58d82f5132b2acd7ef97009297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm14-opt-viewer opt-viewer"
RDEPENDS:${PN} += "/usr/bin/python3 python(abi) python3-PyYAML python3-Pygments"

inherit rpm
