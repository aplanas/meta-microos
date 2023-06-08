SUMMARY = "Plasma library and runtime components"
DESCRIPTION = "Plasma library and runtime components based upon KF5 and Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "plasma-framework-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "cb9fb6c55d9b60cdb826508026ee35e3ac0989bda0e860977199e0592f68a97cb54a119c811a6f80e8d4057789adf77e0f2f425fe211901dd4cefea7955ed648"

RPROVIDES:${PN} += "cmake(KF5Plasma) cmake(KF5PlasmaQuick) plasma-framework-devel plasma-framework-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Package) cmake(KF5Service) cmake(KF5WindowSystem) cmake(Qt5Gui) cmake(Qt5Qml) cmake(Qt5Quick) extra-cmake-modules kf5-filesystem libKF5Plasma5 plasma-framework plasma-framework-components plasma-framework-private"

inherit rpm
