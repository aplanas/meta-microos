SUMMARY = "HPI Command-line Applications"
DESCRIPTION = "This package contains HPI command-line utilities \
 \
OpenHPI implements the SA Forum's Hardware Platform Interface (HPI). HPI is an \
abstracted interface for managing computer hardware, typically for chassis and \
rack based servers."
LICENSE = "BSD-3-Clause"

PV = "3.8.0.ge4631e8a"

RPM_NAME = "openhpi-clients-3.8.0.ge4631e8a-3.4.aarch64.rpm"
RPM_HASH = "97fcda2031b845ed9116c564bc6f6e826606cdbd4d96674e2204592a401bc3695c4c34ecf563d4c58ebf1171c9ca59f6ce7aafda1a2e267b5b0d7fc1c2a4849c"

RPROVIDES:${PN} += "openhpi-clients openhpi-clients(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libopenhpi.so.4()(64bit) libopenhpiutils.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) openhpi"

inherit rpm
