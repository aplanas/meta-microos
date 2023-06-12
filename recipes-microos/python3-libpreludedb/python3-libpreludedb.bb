SUMMARY = "Python 3 bindings for libpreludedb"
DESCRIPTION = "Python 3 bindings for libpreludedb generated by SWIG."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "python3-libpreludedb-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "ef76812954584c31908e6c3d884a44efaf0a509e928955e84627835caa5c62309402729c8095c3c579947fece1816699e745fb29daff20775522964f18f85dfb"

RPROVIDES:${PN} += "python3-libpreludedb \
python3-libpreludedb(aarch-64) \
python3.10dist(preludedb) \
python3dist(preludedb)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libprelude.so.28()(64bit) \
libpreludecpp.so.12()(64bit) \
libpreludedb.so.7()(64bit) \
libpreludedbcpp.so.2()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
python(abi)"

inherit rpm
