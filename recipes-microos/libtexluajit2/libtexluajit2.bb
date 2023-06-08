SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "libtexluajit2-2.1.0beta3-89.1.aarch64.rpm"
RPM_HASH = "2ea20c8171ff321745c6eece66ae7895284c33d79ecabf0975c9253316fd5f6f14f72b08d80a9c1dbdad4b1b017a8a6d03ca19a4bb36ed6c1332f780b415793a"

RPROVIDES:${PN} += "libtexluajit.so.2()(64bit) libtexluajit2 libtexluajit2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
