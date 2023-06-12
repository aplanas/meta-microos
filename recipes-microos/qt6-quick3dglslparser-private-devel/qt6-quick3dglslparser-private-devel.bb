SUMMARY = "Development files for the Qt 6 Quick3DGlslParser library"
DESCRIPTION = "Development files for the Qt 6 Quick3DGlslParser library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dglslparser-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0fbdfafff8a6ce85954f6f18077d384e8f29f0973836e317edb3a157f2c6f7dba3606dd55dd5ff6cf883b819b47d69bcb40bb2f94951ac1d52e81ee98b408994"

RPROVIDES:${PN} += "cmake(Qt6Quick3DGlslParserPrivate) qt6-quick3dglslparser-private-devel qt6-quick3dglslparser-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Core) libQt6Quick3DGlslParser6"

inherit rpm
