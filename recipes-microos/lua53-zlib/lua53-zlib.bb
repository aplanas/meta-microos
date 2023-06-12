SUMMARY = "Simple streaming interface to zlib for Lua"
DESCRIPTION = "lua-zlib is a simple streaming interface to zlib for Lua."
LICENSE = "MIT | X11"

PV = "1.2+git29"

RPM_NAME = "lua53-zlib-1.2+git29-2.2.aarch64.rpm"
RPM_HASH = "6e893bba57f09d4db3302dae05d75dd8e37243aff80211fdfc49f9db4e7e3b14dc7358b34f1254960328ea5bcf2f3a6122b60ab575a76d9db60c1062b905efea"

RPROVIDES:${PN} += "lua53-zlib \
lua53-zlib(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblua5.3.so.5()(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
lua53"

inherit rpm
