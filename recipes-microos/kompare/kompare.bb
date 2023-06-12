SUMMARY = "File Comparator"
DESCRIPTION = "Tool to visualize changes between two versions of a file."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.1"

RPM_NAME = "kompare-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "5c2dea898bdbb935cd50febbc817ac80ac1c383a52d952fdc388fd5e0abc4c79a2b517271dec7dc56f8c1be95d4ad0c5ae7ecfa201f15bc00017bf03f7f0aff3"

RPROVIDES:${PN} += "application() application(org.kde.kompare.desktop) kompare kompare(aarch-64) kompare5 libkomparedialogpages.so.5()(64bit) libkompareinterface.so.5()(64bit) metainfo() metainfo(org.kde.kompare.appdata.xml) mimehandler(text/x-patch)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Codecs.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5TextEditor.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkomparediff2.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
