SUMMARY = "Development files for pnetcdf_1_12_3-gnu-openmpi3-hpc"
DESCRIPTION = "NetCDF is a set of software libraries and data formats for array-oriented \
scientific data. \
 \
Parallel netCDF (PnetCDF) maintains file-format compatibility with NetCDF. \
 \
This package contains all files needed to create projects that use \
the openmpi version of PnetCDF."
LICENSE = "NetCDF"

PV = "1.12.3"

RPM_NAME = "pnetcdf_1_12_3-gnu-openmpi3-hpc-devel-1.12.3-1.2.aarch64.rpm"
RPM_HASH = "e38638744cb77f9f5aa2efd3d899d212c785b72f8a85e4f8d74f0ff2547bc173f1d778daa6106fa46443113c435d56675eb7dc3f58df37fc8dc462ef1cdc411f"

RPROVIDES:${PN} += "pkgconfig(pnetcdf) pnetcdf_1_12_3-gnu-openmpi3-hpc-devel pnetcdf_1_12_3-gnu-openmpi3-hpc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gnu-compilers-hpc-devel ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgfortran.so.5()(64bit) libgfortran.so.5(GFORTRAN_10)(64bit) libgfortran.so.5(GFORTRAN_8)(64bit) libpnetcdf_1_12_3-gnu-openmpi3-hpc libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) openmpi3-gnu-hpc-devel"

inherit rpm
