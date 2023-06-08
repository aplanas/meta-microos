SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python311-PyICU-2.10.2-1.5.aarch64.rpm"
RPM_HASH = "590ab7f9a145857f3717325c092c5c0b559d6b2f6e63345af3801cb0a75c03bc9fcd5f4b5914626dbfb1071da45461bf72e2e6207945fe17cebfdcbb2fde899d"

RPROVIDES:${PN} += "PyICU python3.11dist(pyicu) python311-ICU python311-PyICU python311-PyICU(aarch-64) python3dist(pyicu)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
