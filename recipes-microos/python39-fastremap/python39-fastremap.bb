SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.4"

RPM_NAME = "python39-fastremap-1.13.4-1.5.aarch64.rpm"
RPM_HASH = "14c3ea549a7577f96463405ea80a712bb4c9de02ebb224546208a1caa04fb6eb853d3aa4651312c97c64a7112a78cb22d66b6e436192d3c1a678ee08373e5efd"

RPROVIDES:${PN} += "python3.9dist(fastremap) python39-fastremap python39-fastremap(aarch-64) python3dist(fastremap)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi) python39-numpy"

inherit rpm
