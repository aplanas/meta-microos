SUMMARY = "Python3 bindings for mraa"
DESCRIPTION = "libmraa is a C/C++ library with bindings to Java, Python and JavaScript to \
interface with the IO on Galileo, Edison & other platforms, with a \
structured API where port names/numbering matches the board that \
you are on. Use of libmraa does not tie you to specific hardware. With board \
detection done at runtime, you can create portable code that will work \
across the supported platforms. \
 \
This package contains python3 bindings for mraa."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python3-mraa-2.2.0-2.10.aarch64.rpm"
RPM_HASH = "83f7acdc34120fbd2369999c40e9bc57a7859ed578b88757690d1f5372f7616b3ae9e0d1372e3f96c2749e787ce6559657e591f986621ae929474278c8e2ccbb"

RPROVIDES:${PN} += "python3-mraa python3-mraa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmraa.so.2()(64bit) libmraa2 libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
