SUMMARY = "Integration of QML and KDE workspaces: Build Environment"
DESCRIPTION = "KDeclarative provides integration of QML and KDE workspaces. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kdeclarative-devel-5.106.0-1.2.aarch64.rpm"
RPM_HASH = "51b7b4c34d02a67331605306e20fc5fcf64605c206c4aec8a2dbfe51a35de862cbb7445db89b463c29ef2d3feff3142a4f8492b19a51ee6c819e6e31fcc52ed6"

RPROVIDES:${PN} += "cmake(KF5Declarative) \
kdeclarative-devel \
kdeclarative-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Config) \
cmake(KF5CoreAddons) \
cmake(KF5Package) \
cmake(Qt5Qml) \
extra-cmake-modules \
kdeclarative-components \
libKF5CalendarEvents5 \
libKF5Declarative5 \
libKF5QuickAddons5"

inherit rpm
