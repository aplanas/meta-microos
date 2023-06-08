SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "13.0.1"

RPM_NAME = "llvm13-doc-13.0.1-8.1.noarch.rpm"
RPM_HASH = "d06649f66d774ea5f3484c0401b156e61201a54fb208c557c3e45fb0a0ff1c32f6b799124967990dc2c4aa482f21509d93139e81fd3638eb6e1c547e1528bc6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-doc-provider llvm13-doc"
RDEPENDS:${PN} += "llvm13"

inherit rpm
