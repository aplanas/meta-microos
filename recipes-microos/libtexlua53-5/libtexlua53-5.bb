SUMMARY = "Libraries of an extended version of pdfTeX using Lua"
DESCRIPTION = "LuaTeX is an extended version of pdfTeX using Lua as an \
embedded scripting language"
LICENSE = "MIT"

PV = "5.3.6"

RPM_NAME = "libtexlua53-5-5.3.6-89.1.aarch64.rpm"
RPM_HASH = "bb4f469eefc7a6707b2f2fec538f26b262d79124a1f7f11f5c3456e5c7fa3150ab851519c2cf890988851af7592e4cddfea36bf14094f7791a9908734e9b6267"

RPROVIDES:${PN} += "libtexlua53-5 libtexlua53-5(aarch-64) libtexlua53.so.5()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
