SUMMARY = "Development files for lua"
DESCRIPTION = "Lua is a programming language originally designed for extending \
applications, but is also frequently used as a general-purpose, \
stand-alone language. \
 \
This package contains files needed for embedding lua into your \
application."
LICENSE = "MIT"

PV = "5.4.4"

RPM_NAME = "lua54-devel-5.4.4-10.1.aarch64.rpm"
RPM_HASH = "b8a669a25f288a5a2c548eb52174105512009ab646a2e04d7c7fba0e81075d09f268f54d07cfcad9de2c3b4d32e7584e43c7183ef61a9a4aefed2b8dc6868bb6"

RPROVIDES:${PN} += "Lua(devel) lua-devel lua54-devel lua54-devel(aarch-64) pkgconfig(lua) pkgconfig(lua5.4)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config liblua5_4-5 lua-macros lua54 update-alternatives"

inherit rpm
