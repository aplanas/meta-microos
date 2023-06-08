SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python311-nlopt-2.7.1-3.14.aarch64.rpm"
RPM_HASH = "5cdba65454eed06078f54f821198bc3f324a2b6e751f38019388b5375f2110c4cd0fdc7fcaf42325aafb74b3b074f3645851de831559613dea7237178028883c"

RPROVIDES:${PN} += "python311-nlopt python311-nlopt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libnlopt.so.0()(64bit) libpython3.11.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi) python311-numpy"

inherit rpm
