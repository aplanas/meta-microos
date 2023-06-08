SUMMARY = "A Qt wrapper for NetworkManager DBus API"
DESCRIPTION = "NetworkManagerQt provides access to all NetworkManager features \
exposed on DBus. It allows you to manage your connections and control \
your network devices and also provides a library for parsing connection \
settings which are used in DBus communication. Development files."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5NetworkManagerQt-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "a93c763c2dfd5f2b5ccb5fa508d11b3425def79ff607010551e17f34c0be87785b175a681eb42426c495a0f867592bc76b20d64b919c3c9d46a04d4e272031b1"

RPROVIDES:${PN} += "cmake(KF5NetworkManagerQt) libKF5NetworkManagerQt-devel libKF5NetworkManagerQt-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(Qt5Core) cmake(Qt5DBus) cmake(Qt5Network) libKF5NetworkManagerQt6 pkgconfig(libnm)"

inherit rpm
