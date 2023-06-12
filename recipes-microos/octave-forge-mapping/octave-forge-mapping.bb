SUMMARY = "Octave mapping functions"
DESCRIPTION = "Simple Mapping and GIS .shp, .dxf and raster file functions. \
 \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.2"

RPM_NAME = "octave-forge-mapping-1.4.2-1.10.aarch64.rpm"
RPM_HASH = "9db4008dfb13454673ccc6e399969291dfdc37cc27b235f55fabea5dfc1f2ed4bdc25b95e6abb21a4d3ddfa10188ee0cacc80e755c8dbf11f153fbd23fb21527"

RPROVIDES:${PN} += "octave-forge-mapping \
octave-forge-mapping(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdal.so.32()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
octave-cli \
octave-forge-geometry \
octave-forge-io"

inherit rpm
