SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python310-Fiona-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "58ebae7a52407819038642873a309636d3bed892e8e84b43b82f2211858cd4715b4f21f74290cf503a2675091e85acd51e2953440ca8be1de45f0a854dcdfec4"

RPROVIDES:${PN} += "python3-Fiona \
python3.10dist(fiona) \
python310-Fiona \
python310-Fiona(aarch-64) \
python3dist(fiona)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgdal.so.32()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi) \
python310-attrs \
python310-click \
python310-click-plugins \
python310-cligj \
python310-munch \
python310-six"

inherit rpm
