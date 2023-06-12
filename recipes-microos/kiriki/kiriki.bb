SUMMARY = "Yahtzee-like Game"
DESCRIPTION = "Kiriki is the KDE version of the dice game Yahtzee where you roll dices \
to get higher scores in several combinations"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kiriki-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "4398ab860eb92f9b0f2d77ef1b810fd8dc06b58de0edbc45fa90cb306babcc4802ea86d41e22020a419d528894e2272e72081ec04e797413cdc658c1021d2a86"

RPROVIDES:${PN} += "application() application(org.kde.kiriki.desktop) kiriki kiriki(aarch-64) kiriki5 metainfo() metainfo(org.kde.kiriki.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
