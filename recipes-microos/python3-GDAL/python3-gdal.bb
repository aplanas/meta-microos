SUMMARY = "GDAL Python3 module"
DESCRIPTION = "The GDAL python modules provide support to handle multiple GIS file formats."
LICENSE = "BSD-3-Clause & MIT & SUSE-Public-Domain"

PV = "3.6.3"

RPM_NAME = "python3-GDAL-3.6.3-1.4.aarch64.rpm"
RPM_HASH = "d9c76e6eacde05a0e51a280eb7492a31eed47427772527c12ca1dabe1c7c81a8909e0cb4a411a592954d9d5d85b92eb022ac65a6725e1669dcd27531d32f610c"

RPROVIDES:${PN} += "python3-GDAL python3-GDAL(aarch-64) python3-gdal python3.10dist(gdal) python3dist(gdal)"
RDEPENDS:${PN} += "gdal ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdal.so.32()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi)"

inherit rpm
