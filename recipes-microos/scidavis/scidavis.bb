SUMMARY = "An application for Scientific Data Analysis and Visualization"
DESCRIPTION = "SciDAVis is an interactive application for data analysis and \
publication-quality plotting. It has scriptability and can be extended. \
 \
SciDAVis is similar in its field of application to proprietary Windows \
applications like Origin and SigmaPlot as well as free applications like \
QtiPlot, Labplot and Gnuplot."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "1.22"

RPM_NAME = "scidavis-1.22-2.6.aarch64.rpm"
RPM_HASH = "ef3fdf74fe93722da5ba69c3f0e78cbf1fbf64218ac023af4d7850d926069dad6d006a24d0c61eec87e31e1187b9053cdfd112770fc5de0d1cd9682c80a90695"

RPROVIDES:${PN} += "application() application(scidavis.desktop) libexp_saturation.so.1()(64bit) libexplin.so.1()(64bit) libfitRational0.so.1()(64bit) libfitRational1.so.1()(64bit) libplanck_wavelength.so.1()(64bit) metainfo() metainfo(scidavis.appdata.xml) mimehandler(application/x-sciprj) scidavis scidavis(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLU.so.1()(64bit) libQt3Support.so.4()(64bit) libQtCore.so.4()(64bit) libQtGui.so.4()(64bit) libQtOpenGL.so.4()(64bit) libQtSvg.so.4()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgsl.so.23()(64bit) libgslcblas.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmuparser.so.2.2.6()(64bit) libpthread.so.0()(64bit) libpthread.so.0(GLIBC_2.17)(64bit) libqwt.so.5()(64bit) libqwtplot3d.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
