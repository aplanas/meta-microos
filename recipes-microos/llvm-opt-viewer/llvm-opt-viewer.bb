SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated \
with -fsave-optimization-record. Used for compiler-assisted performance \
analysis. \
 \
This package is a dummy package that depends on the version of \
llvm-opt-viewer that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.4"

RPM_NAME = "llvm-opt-viewer-16.0.4-1.1.noarch.rpm"
RPM_HASH = "3372556bee83e56a03aae8a5ab36575b9f4d9ce0ab7cc9c2033a11d91185ac377320936036c59d82384f772c6b3f4fe8aa38ea87682ae6da2e0b3250b2677358"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-opt-viewer"
RDEPENDS:${PN} += "llvm16-opt-viewer"

inherit rpm
