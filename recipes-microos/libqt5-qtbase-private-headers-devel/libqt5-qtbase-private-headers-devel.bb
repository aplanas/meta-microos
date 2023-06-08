SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtbase-devel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libqt5-qtbase-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "3f2326f00ec2ad4451530372b6fd9b7189d74a1349b7fe72cd6d88e6fe6d6d899970dc1c985fe95dee09c460e53d2a27bfcbeb466a609e2b30dc1d10cc7ddf65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtbase-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5DBus-private-headers-devel libQt5Gui-private-headers-devel libQt5KmsSupport-private-headers-devel libQt5Network-private-headers-devel libQt5OpenGL-private-headers-devel libQt5PlatformSupport-private-headers-devel libQt5PrintSupport-private-headers-devel libQt5Sql-private-headers-devel libQt5Test-private-headers-devel libQt5Widgets-private-headers-devel libqt5-qtbase-devel"

inherit rpm
