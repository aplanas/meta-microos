SUMMARY = "System Log Viewer Tool"
DESCRIPTION = "This program is developed for use by beginner users, who do not know \
how to find information about their Linux system and how the log files \
are in their computer. But it is also designed for advanced users, who \
want to quickly see problems occurring on their server."
LICENSE = "GPL-2.0-only"

PV = "23.04.0"

RPM_NAME = "ksystemlog-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7d3c88b47ff2fe68bcf4e2f936c0df0f4ef44749fa8cea10bf53b620f834a6cc661f68afeab3d990e648fde4c0e70e4da07e14fdaaeaa381a01ae2f373e49652"

RPROVIDES:${PN} += "application() application(org.kde.ksystemlog.desktop) ksystemlog ksystemlog(aarch-64) ksystemlog5 metainfo() metainfo(org.kde.ksystemlog.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Archive.so.5()(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5ItemViews.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5TextWidgets.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libsystemd.so.0(LIBSYSTEMD_246)(64bit)"

inherit rpm
