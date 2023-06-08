SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python39-debugpy-1.6.6-3.4.aarch64.rpm"
RPM_HASH = "5b637a492d5295ee6552efae14c032b408a23580a7656964c8842f387bc39d43a51d476526da29dff1f50735f0c60fb011e5190546510cbce3429823c272b62c"

RPROVIDES:${PN} += "python3.9dist(debugpy) python39-debugpy python39-debugpy(aarch-64) python3dist(debugpy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
