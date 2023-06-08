SUMMARY = "Python Extension Wrapping the ICU C++ API"
DESCRIPTION = "Python extension wrapping IBM's International Components for Unicode C++ \
library (ICU)."
LICENSE = "MIT"

PV = "2.10.2"

RPM_NAME = "python310-PyICU-2.10.2-1.5.aarch64.rpm"
RPM_HASH = "4657e89ec932612742a972b0e8dd0ee616b19cd31dfac59926008716ecd53b4bebae96caf3df9c2c0e8d1e3ebad2c718cf4d98df20f4743b322b9df3a8b25d53"

RPROVIDES:${PN} += "PyICU python3-ICU python3-PyICU python3.10dist(pyicu) python310-ICU python310-PyICU python310-PyICU(aarch-64) python3dist(pyicu)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
