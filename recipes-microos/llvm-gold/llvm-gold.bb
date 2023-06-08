SUMMARY = "Gold linker plugin for LLVM"
DESCRIPTION = "This package contains the Gold linker plugin for LLVM. \
 \
This package is a dummy package that depends on the version of \
llvm-gold that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-WITH-LLVM-exception | NCSA"

PV = "16.0.2"

RPM_NAME = "llvm-gold-16.0.2-1.1.aarch64.rpm"
RPM_HASH = "80155a61481f7088a89c27e2b14c8c6e15905521cf86bec56884a02e860186d5d714b2cf0e68e794bdca42956bc598eef6a1b79b4b80afc016347ba9229b4f94"

RPROVIDES:${PN} += "llvm-gold llvm-gold(aarch-64)"
RDEPENDS:${PN} += "llvm16-gold"

inherit rpm
