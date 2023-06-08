SUMMARY = "David Kolf's JSON module for Lua"
DESCRIPTION = "dkjson is a module for encoding and decoding JSON data. It \
supports UTF-8. \
 \
JSON (JavaScript Object Notation) is a format for serializing \
data based on the syntax for JavaScript data structures. \
 \
dkjson is written in Lua without any dependencies, but \
when LPeg is available dkjson can use it to speed up decoding."
LICENSE = "MIT"

PV = "2.5.2"

RPM_NAME = "lua54-dkjson-2.5.2-5.2.noarch.rpm"
RPM_HASH = "a5423a87e2a674127662609be6373dc134ca5a7f9094cba4c08d4f3aafead07646e87bbf45f822b32ee51e3a5c890dc6d602078c990d0c21be2a945b5ecc033f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua-dkjson lua54-dkjson"
RDEPENDS:${PN} += "lua54 lua54-lpeg"

inherit rpm
