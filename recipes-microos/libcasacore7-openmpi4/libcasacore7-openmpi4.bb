SUMMARY = "Shared libraries for casacore, a suite of radio astronomy data"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the shared libraries for casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.5.0"

RPM_NAME = "libcasacore7-openmpi4-3.5.0-2.13.aarch64.rpm"
RPM_HASH = "8b3e012246b5d6574fcd0347b12ea90424c9d97306142efaf86c37aed54976d0c5fbc537f8d32d84029ded345e84ccf861c70cfed0b5190c8a6d9037ba8f9390"

RPROVIDES:${PN} += "libcasa_casa.so.7()(64bit) libcasa_coordinates.so.7()(64bit) libcasa_derivedmscal.so.7()(64bit) libcasa_fits.so.7()(64bit) libcasa_images.so.7()(64bit) libcasa_lattices.so.7()(64bit) libcasa_meas.so.7()(64bit) libcasa_measures.so.7()(64bit) libcasa_mirlib.so.7()(64bit) libcasa_ms.so.7()(64bit) libcasa_msfits.so.7()(64bit) libcasa_python3.so.7()(64bit) libcasa_scimath.so.7()(64bit) libcasa_scimath_f.so.7()(64bit) libcasa_tables.so.7()(64bit) libcasacore7-openmpi4 libcasacore7-openmpi4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_python-py3.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcfitsio.so.10()(64bit) libfftw3.so.3()(64bit) libfftw3_threads.so.3()(64bit) libfftw3f.so.3()(64bit) libfftw3f_threads.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.0.0)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libgomp.so.1(OMP_1.0)(64bit) libgsl.so.27()(64bit) libgslcblas.so.0()(64bit) libhdf5.so.200()(64bit) liblapack.so.3()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmpi.so.40()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwcs.so.7()(64bit)"

inherit rpm
