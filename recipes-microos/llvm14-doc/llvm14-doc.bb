SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-doc-14.0.6-8.1.noarch.rpm"
RPM_HASH = "08168005849a62dae28089b806c121f76e180529e9a5fb55c467a5d204fe55ac350a208ca21e8c46ef9c6520a745117da6a1408d43381f2ed8ff61f21783438a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider llvm14-doc"
RDEPENDS:${PN} += "llvm14"

inherit rpm
