SUMMARY = "Plugin framework for user interface components"
DESCRIPTION = "This library implements the framework for KDE parts, which are \
elaborate widgets with a user-interface defined in terms of actions \
(menu items, toolbar icons). Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "kparts-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "cf757fd73442eb7c88a3dcd5a3332cece1c32cda2e0e9672ba5c31c0b8be26ea81d9b399a4fde1893512db36dd2c587a72cdb0c696a0d0b3ddd811a8ba5d24c4"

RPROVIDES:${PN} += "cmake(KF5Parts) kparts-devel kparts-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5KIO) cmake(KF5TextWidgets) cmake(KF5XmlGui) extra-cmake-modules libKF5Parts5"

inherit rpm
