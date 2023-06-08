SUMMARY = "KPart for rendering Markdown content"
DESCRIPTION = "A(nother) Markdown viewer KParts plugin, which allows \
KParts-using applications to display files in \
Markdown format in the rendered target format. \
Examples are Ark, Krusader, Kate's preview plugin & Konqueror."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "markdownpart-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "ebaef25738109a2d38306fc3623a3f7b646d067b1de18f8264e30a471c24add1539bfa432d3e99e1ac8eb95d44698adfa006341782d62f4341a76bd5a5ec8415"

RPROVIDES:${PN} += "markdownpart markdownpart(aarch-64) metainfo() metainfo(org.kde.markdownpart.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5Parts.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
