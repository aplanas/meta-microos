SUMMARY = "High-level hex editor/viewer framework libraries"
DESCRIPTION = "Kasten is a WIP higher-level framework for composable document-centric \
applications."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.10"

RPM_NAME = "libKasten4-0.26.10-1.3.aarch64.rpm"
RPM_HASH = "6e41b77e07b3a41431ce837974ae608d6ceeee634274cfb3cbcc1a3b20360cbe17bbc3175449cc9e4d348111269a7fb81b479452d695afbe7f769540478a650a"

RPROVIDES:${PN} += "libKasten4 libKasten4(aarch-64) libKasten4Controllers.so.0()(64bit) libKasten4Core.so.0()(64bit) libKasten4Gui.so.0()(64bit) libKasten4Okteta2Controllers.so.0()(64bit) libKasten4Okteta2Core.so.0()(64bit) libKasten4Okteta2Gui.so.0()(64bit) libkasten"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5IconThemes.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KCMUtils.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOFileWidgets.so.5()(64bit) libKF5NewStuff.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libOkteta3Core.so.0()(64bit) libOkteta3Gui.so.0()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Script.so.5()(64bit) libQt5Script.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libqca-qt5.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) okteta-data"

inherit rpm
