SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python311-PyICU-2.10.2-1.6.aarch64.rpm"
RPM_HASH = "bd80fc93061f98ca47b5e6e3d47e8855f84b7d8d0d725869e7f8ad612b603fec9ba31c77535bc17b2a26a498c99274e756195e75e86b9b203ec622bff1749377"

RPROVIDES:${PN} += "PyICU python3.11dist(pyicu) python311-ICU python311-PyICU python311-PyICU(aarch-64) python3dist(pyicu)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.73()(64bit) libicuuc.so.73()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
