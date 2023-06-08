SUMMARY = "SVG viewer component"
DESCRIPTION = "An SVG viewer component (KPart)."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "svgpart-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "cdc0dc7ef5bc4fcbf67011cf6840a4a4f12e686a1c8eb33df56127c52332bc955e32940adf84c3ee0b79830ca8bd652b7ac5087178a2f82cb39a19bc48708ad4"

RPROVIDES:${PN} += "metainfo() metainfo(org.kde.svgpart.metainfo.xml) svgpart svgpart(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
