SUMMARY = "Non-ABI stable experimental API for the Qt5 D-Bus library"
DESCRIPTION = "This package provides private headers of libQt5DBus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5DBus-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "e267f7918664e28512f93b3c9a32984c0184c2804cd32dcb1eec4c4b619c33df1fa305909478bb9dfeab143133d4c8aa37081fe0908d92ac31252fe0fc51e2fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5DBus-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5DBus-devel"

inherit rpm
