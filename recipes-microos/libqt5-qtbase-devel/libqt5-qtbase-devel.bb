SUMMARY = "Development files for the Qt5 base library"
DESCRIPTION = "You need this package if you want to compile programs with Qt. It \
contains the 'Qt Crossplatform Development Kit'. It does contain \
include files and development applications like GUI designers, \
translator tools and code generators."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libqt5-qtbase-devel-5.15.9+kde151-1.1.aarch64.rpm"
RPM_HASH = "acf36d082a1c7e01e133234cef1e99900260ffdc8e3d52175442bd9d2107e8d4b400c597d95632ddd0fc81bb3f8e0e9edbdbbe536970c60de163702bd9296566"

RPROVIDES:${PN} += "libqt5-qtbase-devel libqt5-qtbase-devel(aarch-64)"
RDEPENDS:${PN} += "libQt5Concurrent-devel libQt5Core-devel libQt5DBus-devel libQt5Gui-devel libQt5Network-devel libQt5OpenGL-devel libQt5PlatformHeaders-devel libQt5PrintSupport-devel libQt5Sql-devel libQt5Test-devel libQt5Widgets-devel libQt5Xml-devel libqt5-qtbase-common-devel"

inherit rpm
