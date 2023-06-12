SUMMARY = "Library for KDE Games: Build Environment"
DESCRIPTION = "This package contains all necessary files and libraries needed to \
develop KDE games."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "libkdegames-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "e42b02baca80a17283e980a112f85c839840cea07d5b40ded3b40281d2945b6a457bcad81e0689faa2dc065f7d65f83d539a0a1a2e00c5343c491db654f97a96"

RPROVIDES:${PN} += "cmake(KF5KDEGames) libkdegames-devel libkdegames-devel(aarch-64) libkdegames-kf5-devel"
RDEPENDS:${PN} += "cmake(KF5Completion) cmake(KF5Config) cmake(KF5ConfigWidgets) cmake(KF5I18n) cmake(KF5WidgetsAddons) cmake(Qt5Network) cmake(Qt5Qml) cmake(Qt5QuickWidgets) cmake(Qt5Widgets) cmake(Qt5Xml) libKF5KDEGames7 libsndfile-devel openal-soft-devel"

inherit rpm
