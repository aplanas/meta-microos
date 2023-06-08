SUMMARY = "Python 3 bindings for the libdnf library"
DESCRIPTION = "This package provides the Python 3 bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.70.0"

RPM_NAME = "python3-libdnf-0.70.0-1.3.aarch64.rpm"
RPM_HASH = "83fb2233889a53096efda9290d8872b9a7da1cd152ba863860fad4c87fa98f2a196e73d8875bc8d0da7185b591aaeee18ffa9ea484fbeb8eecf2b0b647f5e487"

RPROVIDES:${PN} += "python3-libdnf python3-libdnf(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libdnf.so.2()(64bit) libdnf2(aarch-64) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpython3.10.so.1.0()(64bit) libsmartcols.so.1()(64bit) libsmartcols.so.1(SMARTCOLS_2.25)(64bit) libsmartcols.so.1(SMARTCOLS_2.27)(64bit) libsmartcols.so.1(SMARTCOLS_2.28)(64bit) libsmartcols.so.1(SMARTCOLS_2.29)(64bit) libsmartcols.so.1(SMARTCOLS_2.30)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
