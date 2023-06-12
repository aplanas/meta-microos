SUMMARY = "Development files for the Qt5 base library"
DESCRIPTION = "You need this package if you want to compile programs with Qt. It \
contains the 'Qt Crossplatform Development Kit'. It does contain \
include files and development applications like GUI designers, \
translator tools and code generators."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libqt5-qtbase-devel-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "d2b1e8d0ae321b44fa4b855d18acc11a267bbc5b6c2cb72a945e735e7e72753f40b6140c2ff966cc48d9b3afefb98e6d0de3ec3ca385f8f81b0e40767a6d628a"

RPROVIDES:${PN} += "libqt5-qtbase-devel \
libqt5-qtbase-devel(aarch-64)"
RDEPENDS:${PN} += "libQt5Concurrent-devel \
libQt5Core-devel \
libQt5DBus-devel \
libQt5Gui-devel \
libQt5Network-devel \
libQt5OpenGL-devel \
libQt5PlatformHeaders-devel \
libQt5PrintSupport-devel \
libQt5Sql-devel \
libQt5Test-devel \
libQt5Widgets-devel \
libQt5Xml-devel \
libqt5-qtbase-common-devel"

inherit rpm
