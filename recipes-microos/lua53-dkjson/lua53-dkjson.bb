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

RPM_NAME = "lua53-dkjson-2.5.2-5.2.noarch.rpm"
RPM_HASH = "361178343d13f64d4133d255e7d40bc259bbc040b15a28431ad408682b20e795138f65859bbb8cff9ef83379ed976d6de058d958c3e71a30dcc159ef3309353f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-dkjson"
RDEPENDS:${PN} += "lua53 \
lua53-lpeg"

inherit rpm
