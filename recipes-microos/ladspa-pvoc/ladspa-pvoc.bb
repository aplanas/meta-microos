SUMMARY = "LADSPA pvoc plugins"
DESCRIPTION = "This package provides a LADSPA (Linux Audio Developer's Simple Plug-in API) \
pvoc plugin implementing a phase vocoder."
LICENSE = "GPL-2.0+"

PV = "0.1.12"

RPM_NAME = "ladspa-pvoc-0.1.12-3.25.aarch64.rpm"
RPM_HASH = "c5359c267b2266db1831ca2120c100467c3b2dad8ddd90161b82cabc5b870cb236b0f7190f942bdc80e8f4c8f018d1fed147100997be5dbe55707fb89e1a434b"

RPROVIDES:${PN} += "ladspa-pvoc ladspa-pvoc(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libfftw3f.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
