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

PV = "23.04.1"

RPM_NAME = "skanpage-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "a40b71a3971c18ae124bc75e777fbcdcc2942cbc64452bb7f5176dae7155a8cccd7ca95e2485b08ac9c77b38992457ba6905c0eb19e9c541d24e72b18638cb44"

RPROVIDES:${PN} += "application() application(org.kde.skanpage.desktop) metainfo() metainfo(org.kde.skanpage.appdata.xml) skanpage skanpage(aarch-64)"
RDEPENDS:${PN} += "kirigami2 libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKSaneCore.so.1()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libleptonica.so.6()(64bit) libqt5-qtquickcontrols libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtesseract.so.5.3.0()(64bit)"

inherit rpm
