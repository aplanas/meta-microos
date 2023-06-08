SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python310-debugpy-1.6.6-3.4.aarch64.rpm"
RPM_HASH = "e87cb99bd7e8e3b296687d50ebcb34a3c8fbbaa08939c1b9f2ed19af2e4d68a2fa6bd6aa6dec01497c84b38bf25cecafaec7b75bd90464cb3f79209178d3c818"

RPROVIDES:${PN} += "python3-debugpy python3.10dist(debugpy) python310-debugpy python310-debugpy(aarch-64) python3dist(debugpy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
