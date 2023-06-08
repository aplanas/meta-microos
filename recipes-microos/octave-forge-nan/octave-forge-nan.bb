SUMMARY = "A statistics and machine learning toolbox"
DESCRIPTION = "A statistics and machine learning toolbox for data with and w/o missing values. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.0"

RPM_NAME = "octave-forge-nan-3.7.0-1.6.aarch64.rpm"
RPM_HASH = "f06af684d463c047cf9de715fc205a6d45fe385cb6dbf0d00580e98fa27287066ed24908ac2b94bf86f8ecc131dcdf9bd0fbde36929e29c7d444539f98af917b"

RPROVIDES:${PN} += "octave-forge-nan octave-forge-nan(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopenblas.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) octave-cli"

inherit rpm
