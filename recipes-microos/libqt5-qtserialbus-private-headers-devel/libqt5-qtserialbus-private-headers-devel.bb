SUMMARY = "Non-ABI stable experimental API for the Qt5 SerialBus library"
DESCRIPTION = "This package provides private headers of libqt5-qtserialbus that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtserialbus-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "1435bb3b6015fadd8dbfe00fd43a04b982f1d06ef6a49e1584fb3ed007c8d6bef2bbc1041550a9d8e8eca7a51befb7e0f5934dd053f32ec34de8405e31e8ec94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtserialbus-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libqt5-qtserialbus-devel"

inherit rpm
