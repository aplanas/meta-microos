SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtbase-devel that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libqt5-qtbase-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "8864df8d313c928914013872f3adf5cfc94f4a94ff8eae2ad7093daa8f2dc691b86db8e3976705cf27948509e228b78b2fa84a7ae4c294979692142763381c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtbase-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5DBus-private-headers-devel libQt5Gui-private-headers-devel libQt5KmsSupport-private-headers-devel libQt5Network-private-headers-devel libQt5OpenGL-private-headers-devel libQt5PlatformSupport-private-headers-devel libQt5PrintSupport-private-headers-devel libQt5Sql-private-headers-devel libQt5Test-private-headers-devel libQt5Widgets-private-headers-devel libqt5-qtbase-devel"

inherit rpm
