SUMMARY = "Split, Merge, Rotate and Mix PDF Files"
DESCRIPTION = "An application to split, merge, rotate, mix and create multipage PDF files."
LICENSE = "GPL-3.0-only"

PV = "1.1.1"

RPM_NAME = "pdfmixtool-1.1.1-2.3.aarch64.rpm"
RPM_HASH = "2df9ec9cf63acae7cd3e02ca1b0f52fe189c19fd440526264f86eb43f4be26b0b3fc1ca3a3e3124f1598436202c58476fc843a0995ee47fa64d426612c419a75"

RPROVIDES:${PN} += "application() application(eu.scarpetta.PDFMixTool.desktop) metainfo() metainfo(eu.scarpetta.PDFMixTool.appdata.xml) mimehandler(application/pdf) mimehandler(application/x-bzpdf) mimehandler(application/x-gzpdf) mimehandler(application/x-wwf) pdfmixtool pdfmixtool(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagick++-7.Q16HDRI.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libqpdf.so.29()(64bit) libqpdf.so.29(LIBQPDF_29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
