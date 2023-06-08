SUMMARY = "Non-ABI stable API for the Qt 6 Widgets library"
DESCRIPTION = "This package provides private headers of libQt6Widgets that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-widgets-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "024805daad3b537d45bddb1a7bf4fc84c128800488cfae2be04fb98c61cd785e158d8a7627f367384eae5c8ab93e2d94e2b29c986c7ebccd4c0f0d6d77295bb5"

RPROVIDES:${PN} += "qt6-widgets-private-devel qt6-widgets-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6Widgets) qt6-core-private-devel qt6-gui-private-devel"

inherit rpm
