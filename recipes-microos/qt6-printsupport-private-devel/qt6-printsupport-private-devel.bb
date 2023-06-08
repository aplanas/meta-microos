SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-printsupport-private-devel-6.5.0-3.1.aarch64.rpm"
RPM_HASH = "c8298e77261e2c20c601cf2301d816c95acb43ef286107aee41fa2bf944722a098fe3a8aeccc7894cb470a3093aa383e7afd38efd90cd007905f576e29706646"

RPROVIDES:${PN} += "qt6-printsupport-private-devel qt6-printsupport-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6PrintSupport) cups-devel qt6-core-private-devel qt6-gui-private-devel qt6-widgets-private-devel"

inherit rpm
