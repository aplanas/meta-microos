SUMMARY = "YouTube client"
DESCRIPTION = "PlasmaTube allows you to watch YouTube videos on your phone or desktop using a \
elegant user interface integrated with the rest of Plasma."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "plasmatube-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8f43860f70f5503e14a89360ee33459f594f112a4055c99691230c9e7b0b930bddc38ffe84516e15dbb07ddbbb6d7f4429bf0c231d208489e03d50b9ba06a322"

RPROVIDES:${PN} += "application() application(org.kde.plasmatube.desktop) metainfo() metainfo(org.kde.plasmatube.appdata.xml) plasmatube plasmatube(aarch-64)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5QuickControls2.so.5()(64bit) libQt5QuickControls2.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmpv.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) yt-dlp"

inherit rpm
