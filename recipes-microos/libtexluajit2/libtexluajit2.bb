SUMMARY = "Libraries of Just-In-Time compiler for Lua"
DESCRIPTION = "LuaJIT is a Just-In-Time (JIT) compiler for the Lua programming language"
LICENSE = "MIT"

PV = "2.1.0beta3"

RPM_NAME = "libtexluajit2-2.1.0beta3-91.1.aarch64.rpm"
RPM_HASH = "1cb87b1ee4a223fa87904b05a6ed7cbd73b9989191e0f98fdf9aca0e58cdaac7a7d789a96ad74c932193bf44ce2d729c5a8f9373cadad7cc0ed36257d87815a2"

RPROVIDES:${PN} += "libtexluajit.so.2()(64bit) libtexluajit2 libtexluajit2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
