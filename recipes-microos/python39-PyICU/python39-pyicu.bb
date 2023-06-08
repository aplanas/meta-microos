SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python39-PyICU-2.10.2-1.5.aarch64.rpm"
RPM_HASH = "d09e8a6938a3c6a99c6794e3ce9f9c8be2eb16204401a336fdb4d87b442a1393ab0c9959788ea3cd89e841f585d1c51ad7d562e5869797e3fb90f6f7ec699c97"

RPROVIDES:${PN} += "PyICU python3.9dist(pyicu) python39-ICU python39-PyICU python39-PyICU(aarch-64) python3dist(pyicu)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
