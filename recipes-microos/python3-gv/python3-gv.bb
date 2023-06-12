SUMMARY = "Python 3 Extension for Graphviz"
DESCRIPTION = "The package contains the Python extension for the \
graphviz tools."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "python3-gv-2.49.3-6.5.aarch64.rpm"
RPM_HASH = "b08fac230377a8dd7b45e22abaf21a00502976341697b36a704f28efb8d5dbe053c9acc8660af29992ea13589ae20185122310d6b9655348466ee0ffd486f95c"

RPROVIDES:${PN} += "libgv_python3.so()(64bit) python3-gv python3-gv(aarch-64)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgvc.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) python(abi)"

inherit rpm
