SUMMARY = "Non-ABI stable API for the Qt 6 3DRender library"
DESCRIPTION = "This package provides private headers of libQt63DRender that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-3drender-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b1819de9f6d9c84ca012f367436c524ad0a171883c61b39d54eea77070b7a1fee00dcd52456ab2b97ae524ba3b5b6a6af17cd2698fd7b5802645c2a7f3531854"

RPROVIDES:${PN} += "qt6-3drender-private-devel qt6-3drender-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt63DRender)"

inherit rpm
