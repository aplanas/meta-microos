SUMMARY = "Shared library for reproc"
DESCRIPTION = "reproc (Redirected Process) is a cross-platform C/C++ library that simplifies starting, stopping and communicating with external programs. The main use case is executing command line applications directly from C or C++ code and retrieving their output. \
 \
This package holds the shared library for reproc."
LICENSE = "MIT"

PV = "14.2.4"

RPM_NAME = "libreproc++14-14.2.4-3.1.aarch64.rpm"
RPM_HASH = "e040a7dd8c9627661ade4c9f9852b1c3306255bc5450044ca0f04863315539ec6e1e6e75a7dbbe19e4ee5891de8b768e7dc8b1d43ecd5923432ee7a764d914c6"

RPROVIDES:${PN} += "libreproc++.so.14()(64bit) libreproc++14 libreproc++14(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libreproc.so.14()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
