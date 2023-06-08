SUMMARY = "Intelligent predictive text entry platform (Python binding)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package provides the Python binding for libpresage. \
 \
This package contains the Python extension module for libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presage-0.9.1-12.10.aarch64.rpm"
RPM_HASH = "f534b0100a83d59dae4b3603ed352fcd05cd0914b2a37f0f0f79b0a4d7a18a36b60d7809536f199451e4ca31d4e086edf684db397fee02133b3b589ac5d22ba5"

RPROVIDES:${PN} += "python-presage python3-presage python3-presage(aarch-64) python3.10dist(python-presage) python3dist(python-presage)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpresage.so.1()(64bit) libpresage.so.1(PRESAGE_0.8.3)(64bit) libpresage.so.1(PRESAGE_0.8.5)(64bit) libpresage.so.1(PRESAGE_0.9.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi)"

inherit rpm
