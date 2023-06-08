SUMMARY = "Non-ABI stable API for the Qt 6 Designer libraries"
DESCRIPTION = "This package provides private headers of libQt6Designer that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.0"

RPM_NAME = "qt6-designer-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "b428b49bbcf5038b2f0ba6a164b4f8727e9b44d10b161ff6a9d3263593f37f00c58a4c7906fd134d167e2d7cf6a6138673911fc88f94b3af1355948166eae084"

RPROVIDES:${PN} += "qt6-designer-private-devel qt6-designer-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Designer) qt6-core-private-devel qt6-gui-private-devel qt6-widgets-private-devel"

inherit rpm
