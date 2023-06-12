SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python311-debugpy-1.6.6-4.1.aarch64.rpm"
RPM_HASH = "7a730b3060118bafd1849f6af21cd6f3c84bcf40f6bcd77e5e346bd1890e72f5500a4aeddc82d7ecc12e11a8d04eb8ddb9e2aa35ffd267ff2d226c521a140f66"

RPROVIDES:${PN} += "python3.11dist(debugpy) python311-debugpy python311-debugpy(aarch-64) python3dist(debugpy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
