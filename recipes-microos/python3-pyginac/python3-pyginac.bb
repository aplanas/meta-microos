SUMMARY = "Python bindings for ginac - a symbolic manipulation library"
DESCRIPTION = "PyGiNaC is a Python package that provides an interface to the C++ library \
GiNaC, which is an open framework for symbolic computation within C++. PyGiNaC \
is implemented with the help of the Boost.Python library."
LICENSE = "GPL-2.0-only"

PV = "1.5.5"

RPM_NAME = "python3-pyginac-1.5.5-2.23.aarch64.rpm"
RPM_HASH = "5b842296c87495f358256b2378f253e7372f97fd9cd5574e33619d2ab81c92bc45114815150d4ae1428263b6674ae066f0210bb04bf55d1ab73dcf6d439b0076"

RPROVIDES:${PN} += "python3-pyginac python3-pyginac(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_python-py3.so.1.82.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libcln.so.6()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libginac.so.11()(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
