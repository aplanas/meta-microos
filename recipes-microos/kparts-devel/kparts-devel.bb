SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kparts-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "bd732c914b6e71d83400fe11568891b3497af1240aa226405b30829ac60361e837a93161953644b4e7170d738dd1316f4dda8c66b2976dcabdb0a97f41771679"

RPROVIDES:${PN} += "cmake(KF5Parts) kparts-devel kparts-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5KIO) cmake(KF5TextWidgets) cmake(KF5XmlGui) extra-cmake-modules libKF5Parts5"

inherit rpm
