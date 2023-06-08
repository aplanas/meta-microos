SUMMARY = "Library for KDE Games: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkdegames-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2058bf41c41799bd367b4fe395652460a0e0e4a6fde254832d48f61bd4cf4aac639047f3af2030ecf15e5d5d38a934a4830a5a1a21b70a68e11ab7409973b0d7"

RPROVIDES:${PN} += "cmake(KF5KDEGames) libkdegames-devel libkdegames-devel(aarch-64) libkdegames-kf5-devel"
RDEPENDS:${PN} += "cmake(KF5Completion) cmake(KF5Config) cmake(KF5ConfigWidgets) cmake(KF5I18n) cmake(KF5WidgetsAddons) cmake(Qt5Network) cmake(Qt5Qml) cmake(Qt5QuickWidgets) cmake(Qt5Widgets) cmake(Qt5Xml) libKF5KDEGames7 libsndfile-devel openal-soft-devel"

inherit rpm
