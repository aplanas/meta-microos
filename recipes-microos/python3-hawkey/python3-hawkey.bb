SUMMARY = "Python 3 bindings for the hawkey interface"
DESCRIPTION = "This package provides the Python 3 bindings for libdnf through \
the hawkey interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.1"

RPM_NAME = "python3-hawkey-0.70.1-1.1.aarch64.rpm"
RPM_HASH = "ecc3e92ae47f49ebe739e355b4cd398bdde5103e86dac779de7a1768d0c0e77f801d41430ca4813503dc12529e1ab0bc4c7d0a3c72be636c5b705091ac2e3b58"

RPROVIDES:${PN} += "python3-hawkey \
python3-hawkey(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdnf.so.2()(64bit) \
libdnf2(aarch-64) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python3-libdnf(aarch-64)"

inherit rpm
