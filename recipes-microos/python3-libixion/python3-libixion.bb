SUMMARY = "Python bindings for libixion"
DESCRIPTION = "Python 3 bindings for libixion."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "python3-libixion-0.17.0-3.4.aarch64.rpm"
RPM_HASH = "d124ecffbb0943501a340080db2b623b21cd4b35402e8ddd0632a132f5acad7a55a01c0eaddd441d2447339efde4ffb625d20857917ad380db0a6c108bb5e7f4"

RPROVIDES:${PN} += "libixion-python3 python3-libixion python3-libixion(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libixion-0.17.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
