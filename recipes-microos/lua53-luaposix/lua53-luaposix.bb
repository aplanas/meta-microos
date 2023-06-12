SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua53-luaposix-35.1-2.2.aarch64.rpm"
RPM_HASH = "0360069afb6d120a62233cf672f8414a38b682d578c749f8984216a80921f7ff88e5647a4c8b94371cc62b199730a8b16e441fe83f6d6034db41df0de38f65d7"

RPROVIDES:${PN} += "libgen.so()(64bit) \
lua53-luaposix \
lua53-luaposix(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.33)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
lua53"

inherit rpm
