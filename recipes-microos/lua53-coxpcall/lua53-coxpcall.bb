SUMMARY = "Coroutine safe xpcall and pcall"
DESCRIPTION = "Encapsulates the protected calls with a coroutine based loop, so errors \
can be handled without the usual Lua 5.x pcall/xpcall issues with \
coroutines yielding inside the call to pcall or xpcall."
LICENSE = "MIT"

PV = "1.17.0"

RPM_NAME = "lua53-coxpcall-1.17.0-4.1.noarch.rpm"
RPM_HASH = "eea2beeb67d8a4b6eed0b40a38b1930aac9e31e7d3614da0cb1300cab99b77bcde916ff87fe3821295f5a5ef7556cdcc3c41cef5d2f3d786d01679a79e1403b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua53-coxpcall"
RDEPENDS:${PN} += "lua53"

inherit rpm
