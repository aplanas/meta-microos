SUMMARY = "Development files for pnetcdf_1_12_3-gnu-openmpi2-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi2-hpc-devel-1.12.3-1.3.aarch64.rpm"
RPM_HASH = "428adae22923f6c79fb14f3f6458144844d1ac1c2cbb6bd2281f4aca55b1354f1a2061c701d6f4db69d87ac93d609e092a3e79f40d4b3eeed4c9c117d4760605"

RPROVIDES:${PN} += "pkgconfig(pnetcdf) pnetcdf_1_12_3-gnu-openmpi2-hpc-devel pnetcdf_1_12_3-gnu-openmpi2-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libpnetcdf_1_12_3-gnu-openmpi2-hpc libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) openmpi2-gnu-hpc-devel"

inherit rpm
