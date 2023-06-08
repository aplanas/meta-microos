SUMMARY = "Lua bindings for Clingo"
DESCRIPTION = "Lua bindings for Clingo, a grounder and solver for logic programs. \
 \
Detailed information (including a User's manual), source code, and pre-compiled \
binaries are available at: http://potassco.org/"
LICENSE = "MIT"

PV = "5.6.2"

RPM_NAME = "lua-clingo-5.6.2-1.3.aarch64.rpm"
RPM_HASH = "472f40d8d63bf0dd18caacddf476c3cef21d167a5d9bce820c305d2d53f0925916de2c1a878e6552277bdbed7e328cf622dcf5685d2db81ba7a2fc25e980b5b7"

RPROVIDES:${PN} += "lua-clingo lua-clingo(aarch-64)"
RDEPENDS:${PN} += "clingo libc.so.6(GLIBC_2.17)(64bit) libclingo.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblua5.4.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
