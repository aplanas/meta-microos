SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "192a54dc8add63e61a5f321c42dcdcf9e7eaa3d363792fd1767af2a3447ab1c66b13e0b3bf342a52d0420902a1d0d38ee81d1fdf62dbe7199e97959613761037"

RPROVIDES:${PN} += "qt6-printsupport-private-devel qt6-printsupport-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6PrintSupport) cups-devel qt6-core-private-devel qt6-gui-private-devel qt6-widgets-private-devel"

inherit rpm
