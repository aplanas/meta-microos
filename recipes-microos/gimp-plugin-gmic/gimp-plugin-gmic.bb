SUMMARY = "GMIC plugin for gimp"
DESCRIPTION = "This is a plugin for gimp that exposes many of the nice gmic features \
for interactive use in gimp."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.5"

RPM_NAME = "gimp-plugin-gmic-3.2.5-1.1.aarch64.rpm"
RPM_HASH = "446501cb3750f8c3017fc2185c19c04e3ede5f3efba54fd0f5277c47fab102a0bc99dca307c1623de51d1df0cf4901077f1ff678c3c68bbb620c4c5fb8f541a3"

RPROVIDES:${PN} += "gimp-plugin-gmic gimp-plugin-gmic(aarch-64) gmic-gimp"
RDEPENDS:${PN} += "gimp gmic-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libbabl-0.1.so.0()(64bit) libbabl-0.1.so.0(V0_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfftw3_threads.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgegl-0.4.so.0()(64bit) libgimp-2.0.so.0()(64bit) libgmic.so.3()(64bit) libgobject-2.0.so.0()(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(OMP_1.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
