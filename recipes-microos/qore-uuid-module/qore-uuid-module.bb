SUMMARY = "UUID module for Qore"
DESCRIPTION = "This package contains the uuid module for the Qore Programming Language. \
 \
UUIDs are universally unique identifiers that can be used for any purpose."
LICENSE = "LGPL-2.1-or-later | MIT"

PV = "1.4.1"

RPM_NAME = "qore-uuid-module-1.4.1-1.2.aarch64.rpm"
RPM_HASH = "b21fe46ef25a1b796a1897a719b3d35a4ebd5dfb43c37843aa533c9ec5e2e8d5f5bca98e4a289a2971db06439f580ae67986378edadaddab911f030f05031912"

RPROVIDES:${PN} += "qore-uuid-module \
qore-uuid-module(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libuuid.so.1()(64bit) \
libuuid.so.1(UUID_1.0)(64bit) \
qore-module(abi)(aarch-64)"

inherit rpm
