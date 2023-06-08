SUMMARY = "Multi-Page Scanning Application"
DESCRIPTION = "Skanpage is a simple scanning application designed for \
multi-page scanning and saving of documents and images. \
 \
Features: \
- Scanning from flatbed and ADF scanners \
- Configurable options for scanning device \
- Reordering, rotation and deletion of scanned pages \
- Saving to multi-page PDF documents and image files"
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "skanpage-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "e5c93659e3715a26306b24fd912cf32a1c5e00490474345c3011519a854f8844019bc02e2a46d47bfd3d2b81f241c142ed2ba5e937813c4962ecef9422bb85a8"

RPROVIDES:${PN} += "application() application(org.kde.skanpage.desktop) metainfo() metainfo(org.kde.skanpage.appdata.xml) skanpage skanpage(aarch-64)"
RDEPENDS:${PN} += "kirigami2 libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKSaneCore.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libleptonica.so.6()(64bit) libqt5-qtquickcontrols libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtesseract.so.5.3.0()(64bit)"

inherit rpm
