SUMMARY = "Assorted data for irrlicht"
DESCRIPTION = "Data files for irrlicht applications \
 \
The Irrlicht Engine is a realtime 3D engine written and usable in C++ \
and also available for .NET languages. It is using Direct3D, OpenGL \
and its own software renderer, and has features which can be found in \
commercial 3D engines."
LICENSE = "Zlib"

PV = "1.8.5"

RPM_NAME = "irrlicht-data-1.8.5-1.9.aarch64.rpm"
RPM_HASH = "c172bcdb04ad8d29bc4fbe28672dcc6165ac7985414f7000877d08616613e3c16d5c5514f2d65e0c71017f860a69b4ae7c7f3f6f9d0a8eb5b4f26d7d966bb0c3"

RPROVIDES:${PN} += "irrlicht-data irrlicht-data(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
