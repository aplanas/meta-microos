SUMMARY = "C++ logging library"
DESCRIPTION = "A header-only/compiled, C++ logging library. \
 \
* Asynchronous mode (optional) \
* Multi/Single threaded loggers. \
* Various log targets (rotating/daily files, console, with colors, \
  syslog, custom target)"
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "libspdlog1_11-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "99393c7a008b6b39548d27b2520cc69ff506b8bb55ca1424c04655428c9f90b62aec1ebeb837ad8ddb48cec5855999abcce79414cd6735fc1f3c958cead08b61"

RPROVIDES:${PN} += "libspdlog.so.1.11()(64bit) libspdlog1_11 libspdlog1_11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit)"

inherit rpm
