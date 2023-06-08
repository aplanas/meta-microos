SUMMARY = "PostScript support for the Okular document viewer"
DESCRIPTION = "Document viewing program; supports document in PDF, PS and \
many other formats. This package contains the plugins required \
to display PostScript documents and images."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "okular-spectre-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "2a023db53b618ff78878dfe8b68c3be166cdad967deb62b7ced883e70c7cbb5165cb617d2cb05d7b566a7c90090f6d0733475664fe4ef3fe3572f6dc61bef343"

RPROVIDES:${PN} += "application() application(okularApplication_ghostview.desktop) metainfo() metainfo(org.kde.okular-spectre.metainfo.xml) mimehandler(application/postscript) mimehandler(application/x-bzpostscript) mimehandler(application/x-gzpostscript) mimehandler(image/x-bzeps) mimehandler(image/x-eps) mimehandler(image/x-gzeps) okular-spectre okular-spectre(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libOkular5Core.so.10()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libspectre.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) okular"

inherit rpm
