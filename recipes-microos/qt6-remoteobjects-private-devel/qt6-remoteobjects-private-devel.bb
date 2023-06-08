SUMMARY = "Non-ABI stable API for the Qt 6 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libQt6RemoteObjects that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "qt6-remoteobjects-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "11e14f0b6af0a0623201136322b088fbd9b9584a981440fb193a762ec608633a1408f863a96237c63d315dcb454665053af16773711b5f054faa1383eb5deb60"

RPROVIDES:${PN} += "qt6-remoteobjects-private-devel qt6-remoteobjects-private-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt6RemoteObjects)"

inherit rpm
