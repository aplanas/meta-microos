SUMMARY = "Sound Mixer"
DESCRIPTION = "KMix is a fully featured audio mixer by KDE."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmix-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "cd31b199d42638e87efba3a545330282f9efc0bddcc9f526bc12220c88af3a1b0236dafa9704fe06e12f614acd828fd628861fe48e2c4ba7e058824b434ae5b3"

RPROVIDES:${PN} += "application() application(org.kde.kmix.desktop) config(kmix) kmix kmix(aarch-64) kmix5 libkmixcore.so.5()(64bit) metainfo() metainfo(org.kde.kmix.appdata.xml)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5GlobalAccel.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5Solid.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5WindowSystem.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcanberra.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
