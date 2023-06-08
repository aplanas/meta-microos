SUMMARY = "An implementation of the Debug Adapter Protocol for Python"
DESCRIPTION = "debugpy is an implementation of the Debug Adapter Protocol for Python."
LICENSE = "MIT"

PV = "1.6.6"

RPM_NAME = "python311-debugpy-1.6.6-3.4.aarch64.rpm"
RPM_HASH = "b4aa25a8a3d6d5532d3ee89faf3acc44d79379a485054e92dc62437bff393905980e938a6d3690bdf00124d396aa83745ba02de6ca257914aa3ee735dea604a5"

RPROVIDES:${PN} += "python3.11dist(debugpy) python311-debugpy python311-debugpy(aarch-64) python3dist(debugpy)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) python(abi)"

inherit rpm
