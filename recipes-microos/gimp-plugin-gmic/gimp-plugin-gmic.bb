SUMMARY = "GMIC plugin for gimp"
DESCRIPTION = "This is a plugin for gimp that exposes many of the nice gmic features \
for interactive use in gimp."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "gimp-plugin-gmic-3.2.3-2.1.aarch64.rpm"
RPM_HASH = "2552d1e9c972b23fdb7de6f0561f19dac8a886db538a67e5f910588677ec96d73fd9aab0eaee25230e1b789ae2a2d32041ad979d7ba755a66dcfa4c884e884ba"

RPROVIDES:${PN} += "gimp-plugin-gmic gimp-plugin-gmic(aarch-64) gmic-gimp"
RDEPENDS:${PN} += "gimp gmic-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libbabl-0.1.so.0()(64bit) libbabl-0.1.so.0(V0_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3_threads.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgegl-0.4.so.0()(64bit) libgimp-2.0.so.0()(64bit) libgmic.so.3()(64bit) libgobject-2.0.so.0()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
