SUMMARY = "A toolkit for validation of Monte Carlo event generators"
DESCRIPTION = "The Rivet project (Robust Independent Validation of Experiment and \
Theory) is a toolkit for validation of Monte Carlo event generators. \
It provides a large (and ever growing) set of experimental analyses \
useful for MC generator development, validation, and tuning, as well \
as a convenient infrastructure for adding your own analyses. Rivet is \
the most widespread way by which analysis code from the LHC and other \
high-energy collider experiments is preserved for comparison to and \
development of future theory models. \
 \
This package provides the python bindings for Rivet."
LICENSE = "GPL-2.0-only"

PV = "3.1.7"

RPM_NAME = "python3-Rivet-3.1.7-1.1.aarch64.rpm"
RPM_HASH = "8f7d91a1d58576301d45a531c6ed242319d2b38131918e62c5fa7820c5fb7234cc0655c0cc1f84a953ef092a855fedeb4a13ea5c8fbe706c86f2e3b4ef00923a"

RPROVIDES:${PN} += "python-Rivet python3-Rivet python3-Rivet(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 Rivet-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libHepMC3.so.3()(64bit) libRivet-3.1.7.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpython3.10.so.1.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) python(abi)"

inherit rpm
