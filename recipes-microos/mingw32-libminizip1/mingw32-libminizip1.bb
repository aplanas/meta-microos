SUMMARY = "Zip archive library"
DESCRIPTION = "Minizip is a library for manipulation with files from .zip archives."
LICENSE = "Zlib"

PV = "1.2.13"

RPM_NAME = "mingw32-libminizip1-1.2.13-3.1.noarch.rpm"
RPM_HASH = "587b86d76c5d882999cc40dfa6569b9d76efa937870de7a42c1fd0f2a84805ad5d8a9defc8427e46c265ef840175e2ec0144ad4a5d50757dc7183c1cf8098c68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32(libminizip-1.dll) \
mingw32-libminizip1 \
mingw32-minizip"
RDEPENDS:${PN} += "mingw32(libz.dll)"

inherit rpm
