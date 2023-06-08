SUMMARY = "Electromagnetic field solver library"
DESCRIPTION = "Electromagnetic field solver using the EC-FDTD method library."
LICENSE = "GPL-3.0-only"

PV = "0.0.35"

RPM_NAME = "libopenEMS0-0.0.35-5.36.aarch64.rpm"
RPM_HASH = "2ff1665b08dbce441c1af00fa6617b2054ada45a84df7d1989ec0bf4f7ca9aa6b0cfd554e09ff906869502344cfbd31f2034fd750a1d13001a6cf770e2aadff8"

RPROVIDES:${PN} += "libopenEMS.so.0()(64bit) libopenEMS0 libopenEMS0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libCSXCAD.so.0()(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfparser-4.5.2.so()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libhdf5.so.200()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinyxml.so.0()(64bit) libvtkCommonCore.so.1()(64bit) libvtkCommonDataModel.so.1()(64bit) libvtkIOCore.so.1()(64bit) libvtkIOLegacy.so.1()(64bit) libvtkIOXML.so.1()(64bit) libvtksys.so.1()(64bit)"

inherit rpm
