SUMMARY = "POSIX library for Lua"
DESCRIPTION = "This is a POSIX library for Lua which provides access to many POSIX features \
to Lua programs."
LICENSE = "MIT"

PV = "35.1"

RPM_NAME = "lua51-luaposix-35.1-2.2.aarch64.rpm"
RPM_HASH = "3ef98d38ecac62edb2739853b14094e6f2d11ddf63c60889af9d19de729c0e0f0d9680add3a43f96dfd66acf9e0d63965aea31b5d4ffb902306bd9d4df9b9fe9"

RPROVIDES:${PN} += "libgen.so()(64bit) lua51-luaposix lua51-luaposix(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.33)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) lua51"

inherit rpm
