SUMMARY = "Non-ABI stable experimental API for the Qt5 network library"
DESCRIPTION = "This package provides private headers of libQt5Network that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde151"

RPM_NAME = "libQt5Network-private-headers-devel-5.15.9+kde151-1.1.noarch.rpm"
RPM_HASH = "f0e1ec18f698880dc0d74759d0aa2c4e5a2453fe15e4d8d9c9758a146ddd714636ec1ada663bf0b7ba2155f398eb6ad92c74a10efa71880d2d5eacbd4f9b9ab1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Network-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libQt5Network-devel"

inherit rpm
