SUMMARY = "A stopwatch application by KDE"
DESCRIPTION = "Kronometer is a stopwatch application. \
 \
Kronometer's main features are the following: \
 \
* Start/pause/resume the stopwatch widget \
* Laps recording: you can capture the stopwatch time when you want and add a note to it \
* Lap times sorting: you can easily find the shortest lap time or the longest one \
* Reset the stopwatch widget and the lap times \
* Time format settings: you can choose the stopwatch granularity \
* Times saving and resuming: you can save the stopwatch status and resume it later \
* Font customization: you can choose the fonts for each of the stopwatch digits \
* Color customization: you can choose the color for the stopwatch digits and the stopwatch background \
* Lap times export: you can export the lap times on a file using the JSON or CSV format"
LICENSE = "GPL-2.0-or-later"

PV = "2.2.3"

RPM_NAME = "kronometer-2.2.3-2.11.aarch64.rpm"
RPM_HASH = "3dee93e286462334a0f86e495c018d63f912f9783fcb0259f4bff430b764945720cefc457f4eacd047afacf80e3def5c08a82d6e42588dda5f835d980f737506"

RPROVIDES:${PN} += "application() \
application(org.kde.kronometer.desktop) \
kronometer \
kronometer(aarch-64) \
metainfo() \
metainfo(org.kde.kronometer.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
