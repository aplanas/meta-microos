SUMMARY = "Module for reading and writing spatial data files"
DESCRIPTION = "Fiona is OGR's spatial data API for Python programmers."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "python39-Fiona-1.9.1-1.3.aarch64.rpm"
RPM_HASH = "ad47c1b6d956cddda0a47006ad26b68405c95f97a02ef81da2ee19c3d80f72d4f28987d5e7fd031727c8218fccedb1c02fde4da978939a6565c10df2715ae729"

RPROVIDES:${PN} += "python3.9dist(fiona) python39-Fiona python39-Fiona(aarch-64) python3dist(fiona)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdal.so.32()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi) python39-attrs python39-click python39-click-plugins python39-cligj python39-munch python39-six"

inherit rpm
