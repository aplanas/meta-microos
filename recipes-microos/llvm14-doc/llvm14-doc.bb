SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "14.0.6"

RPM_NAME = "llvm14-doc-14.0.6-9.1.noarch.rpm"
RPM_HASH = "df391565c631a4aded6c67c61cadf247e3a834b932888e38c13ecf7e6fba982caeeda6fd797489b80707fb5d8478f1456578e7268db3d63477c5873c996a5164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider \
llvm14-doc"
RDEPENDS:${PN} += "llvm14"

inherit rpm
