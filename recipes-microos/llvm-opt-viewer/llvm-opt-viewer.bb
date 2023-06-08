SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated \
with -fsave-optimization-record. Used for compiler-assisted performance \
analysis. \
 \
This package is a dummy package that depends on the version of \
llvm-opt-viewer that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-opt-viewer-16.0.2-1.1.noarch.rpm"
RPM_HASH = "166b9e61e881e1fbb3a157497555d4c93b1aabeecc92dd3abfb91feea73a08bafff80050d308cc2efd1ad77ded3cb924e6346963b83974e712d05cb3eceae05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-opt-viewer"
RDEPENDS:${PN} += "llvm16-opt-viewer"

inherit rpm
