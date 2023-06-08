SUMMARY = "Development files for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains all necessary include files and libraries needed \
to develop applications using Octave."
LICENSE = "GPL-3.0-or-later"

PV = "8.2.0"

RPM_NAME = "octave-devel-8.2.0-1.1.aarch64.rpm"
RPM_HASH = "925ec710385c3be35e5e31e49359b56d8e680b16e55d595de51a2d4c3a79b8e44de16454beaeda48c452eff419fbde783f4ec719260f06c5920c2209360adaf3"

RPROVIDES:${PN} += "octave-devel octave-devel(aarch-64) pkgconfig(octave) pkgconfig(octinterp) rpm_macro(octave) rpm_macro(octave_api) rpm_macro(octave_blas) rpm_macro(octave_pkg_build) rpm_macro(octave_pkg_install) rpm_macro(octave_pkg_src) rpm_macro(octave_pkg_test) rpm_macro(octlib_dir) rpm_macro(octpackages_dir) rpm_macro(octskiptests) rpm_macro(octsysw_settings)"
RDEPENDS:${PN} += "/usr/bin/pkg-config fftw3-devel fftw3-threads-devel gcc-c++ gcc-fortran hdf5-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) make octave-cli openblas-devel"

inherit rpm
