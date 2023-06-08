SUMMARY = "Zip archive library"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw64-libminizip1-1.2.13-2.1.noarch.rpm"
RPM_HASH = "386733bb5ad392c34b7ea2ebcb8995f03e490648c463276c616ef5f1a5c4e18f76ff9884c7c261dd6783d861840aeb98f8d77452cab3c656f5edcd6a8fd25ddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64(libminizip-1.dll) mingw64-libminizip1 mingw64-minizip"
RDEPENDS:${PN} += "mingw64(libz.dll)"

inherit rpm
