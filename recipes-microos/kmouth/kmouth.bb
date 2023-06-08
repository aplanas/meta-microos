SUMMARY = "Speech Synthesizer Frontend"
DESCRIPTION = "The computer 'speaks' the entered text for talking with people."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmouth-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b9111da3985a9159082b29119e584bd7a1bfd75c0a8ae33b1c318a957ef29469272cb03049e95eedcca734a8a405d08cd290ef4c2016295e910a8380e6e2df01"

RPROVIDES:${PN} += "application() application(org.kde.kmouth.desktop) config(kmouth) kde4-kmouth kmouth kmouth(aarch-64) metainfo() metainfo(org.kde.kmouth.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5TextToSpeech.so.5()(64bit) libQt5TextToSpeech.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
