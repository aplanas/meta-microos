SUMMARY = "A C++ library to describe geometrical objects and their properties"
DESCRIPTION = "CSXCAD is a C++ library to describe geometrical objects and their physical \
or non-physical properties."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6.2"

RPM_NAME = "libCSXCAD0-0.6.2-3.19.aarch64.rpm"
RPM_HASH = "d9c371d0a67b5266838c6654218f2679fe3c727c7ac5dab4901b3e6af35de97e9aa793156aaef6ec0ab0673b9d8dd9e9a36c119caa4723d31b3dbae64e5ed552"

RPROVIDES:${PN} += "libCSXCAD.so.0()(64bit) libCSXCAD0 libCSXCAD0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfparser-4.5.2.so()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhdf5.so.200()(64bit) libhdf5_hl.so.200()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtinyxml.so.0()(64bit) libvtkCommonCore.so.1()(64bit) libvtkCommonDataModel.so.1()(64bit) libvtkCommonExecutionModel.so.1()(64bit) libvtkCommonMath.so.1()(64bit) libvtkIOGeometry.so.1()(64bit) libvtkIOPLY.so.1()(64bit) libvtksys.so.1()(64bit)"

inherit rpm
