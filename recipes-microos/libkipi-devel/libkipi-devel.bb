SUMMARY = "KDE Image Plugin Interface"
DESCRIPTION = "This package provides a generic KDE Image Plug-in Interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.1"

RPM_NAME = "libkipi-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8284ebd5661868e5098d9cc1e7115a9145849fc38ad9e591c88ac541fe6aa8393f7d7f5cff5273ec066b5443afc7a83aab5d32c4e46f3f9856f86e75707fe0cb"

RPROVIDES:${PN} += "cmake(KF5Kipi) libkipi-devel libkipi-devel(aarch-64) libkipi-kf5-devel"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5I18n) cmake(KF5Service) cmake(KF5XmlGui) cmake(Qt5Core) cmake(Qt5Gui) cmake(Qt5Widgets) libKF5Kipi32_0_0"

inherit rpm
