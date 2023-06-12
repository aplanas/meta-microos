SUMMARY = "Development files for LLDB"
DESCRIPTION = "This package contains the development files for LLDB."
LICENSE = "Apache-2.0-WITH-LLVM-exception & NCSA"

PV = "16.0.4"

RPM_NAME = "lldb16-devel-16.0.4-1.1.aarch64.rpm"
RPM_HASH = "dbfced39719f2250cfdd630e22abe3f044c719f6ef7ba1ce745d27cfcceb6bdd2a6f74091c51501b37a460e8ffdc0b59b8d3031c730b7d16d65a0b6ace6248d1"

RPROVIDES:${PN} += "lldb-devel-provider \
lldb16-devel \
lldb16-devel(aarch-64)"
RDEPENDS:${PN} += "clang16-devel \
liblldb16 \
llvm16-devel \
pkgconfig(libedit) \
pkgconfig(libxml-2.0)"

inherit rpm
