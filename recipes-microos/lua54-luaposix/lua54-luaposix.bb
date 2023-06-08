SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua54-luaposix-35.1-2.2.aarch64.rpm"
RPM_HASH = "3d081c45ef5c584b7b6cc17f45a5bc2dc6de4dfbc82af7e8db31cbcc088f8647662f4166c96210dc7d2344d6b5a288cef5b90c8f013d141dbc0b23fe8f0e0d15"

RPROVIDES:${PN} += "libgen.so()(64bit) lua-luaposix lua54-luaposix lua54-luaposix(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.33)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) lua54"

inherit rpm
