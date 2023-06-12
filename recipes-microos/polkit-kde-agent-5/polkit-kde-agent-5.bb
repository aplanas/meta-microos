SUMMARY = "PolicyKit authentication agent for KDE"
DESCRIPTION = "Provides Policy Kit Authentication Agent that nicely fits to KDE."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "polkit-kde-agent-5-5.27.5-1.2.aarch64.rpm"
RPM_HASH = "ed4bb0091233b73905d179815c340f2dc7cdbae08965b0c86d58e9aa7331e76ddc82918752c107d8b0123ffb8f0705653daab0ff16930df5d4f3bdef4f28329f"

RPROVIDES:${PN} += "application() \
application(org.kde.polkit-kde-authentication-agent-1.desktop) \
polkit-kde-agent-5 \
polkit-kde-agent-5(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5DBusAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5WindowSystem.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpolkit-qt5-agent-1.so.1()(64bit) \
libpolkit-qt5-core-1.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
