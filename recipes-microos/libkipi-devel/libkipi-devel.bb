SUMMARY = "KDE Image Plugin Interface"
DESCRIPTION = "This package provides a generic KDE Image Plug-in Interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.0"

RPM_NAME = "libkipi-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "52b890865a05727b8520dfa4283f331eb637df77cff0ecce5d3fe670b8b195626d1ea1a8a69eb346ce85fe100eaeb9514aa69fd4db4b0385442116a770f30308"

RPROVIDES:${PN} += "cmake(KF5Kipi) libkipi-devel libkipi-devel(aarch-64) libkipi-kf5-devel"
RDEPENDS:${PN} += "cmake(KF5Config) cmake(KF5I18n) cmake(KF5Service) cmake(KF5XmlGui) cmake(Qt5Core) cmake(Qt5Gui) cmake(Qt5Widgets) libKF5Kipi32_0_0"

inherit rpm
