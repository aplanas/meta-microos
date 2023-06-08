SUMMARY = "GREYC's Magick for Image Computing (denoise and others)"
DESCRIPTION = "G'MIC is a framework for image processing, providing \
several different user interfaces to convert/manipulate/filter/visualize \
generic image datasets, from 1d scalar signals to 3d+t sequences of \
multi-spectral volumetric images."
LICENSE = "CECILL-2.1"

PV = "3.2.3"

RPM_NAME = "gmic-3.2.3-2.1.aarch64.rpm"
RPM_HASH = "ae5b10a2afbd1b08d4ac0d90401b6a2ef9ddf4aba2b0179f784f19a87c62901ed6dd3b0048883f8191d8b61551973be848adadc02cd8e354307cea79467fad7f"

RPROVIDES:${PN} += "application() application(gmic_qt.desktop) gmic gmic(aarch-64)"
RDEPENDS:${PN} += "gmic-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3_threads.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmic.so.3()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
