SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kdeclarative-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "0dab7fb0d8ddbc5587ce0f7b5ac55042e93d8af4765732289af497d2dea676f2093e54e6770b2f1cae9cc3c3e09ee895814d46c7d78af7aa1007cb34b495171c"

RPROVIDES:${PN} += "cmake(KF5Declarative) kdeclarative-devel kdeclarative-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5CoreAddons) cmake(KF5Package) cmake(Qt5Qml) extra-cmake-modules kdeclarative-components libKF5CalendarEvents5 libKF5Declarative5 libKF5QuickAddons5"

inherit rpm
