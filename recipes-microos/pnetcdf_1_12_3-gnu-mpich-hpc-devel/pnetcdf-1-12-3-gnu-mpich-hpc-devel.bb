SUMMARY = "Development files for pnetcdf_1_12_3-gnu-mpich-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the mpich version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-mpich-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "a4ea81f9350ef5179ad91f1b78e6d43342d7a62613adbbf80a362683004f9bfcdbc4725b781ea81b5e883206240a6865387837b07b7e39bdce08ba619fd58c68"

RPROVIDES:${PN} += "pkgconfig(pnetcdf) pnetcdf_1_12_3-gnu-mpich-hpc-devel pnetcdf_1_12_3-gnu-mpich-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libpnetcdf_1_12_3-gnu-mpich-hpc libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) mpich-gnu-hpc-devel"

inherit rpm
