SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "llvm16-doc-16.0.4-1.1.noarch.rpm"
RPM_HASH = "53002e8a137d1f2a7d5d74727bbf9988baaeef1c4ee0ffc9fdaa83a6e7d613270739c7141e5667072a6b02b79fb94e32445189cc26b91eb99b31c823a9990972"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm16-doc"
RDEPENDS:${PN} += "llvm16"

inherit rpm
