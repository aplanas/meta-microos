SUMMARY = "T.38 for OpenH323 (modem-compatible interface for IP telephony)"
DESCRIPTION = "This package contains a modem interface for IP telephony using the \
H.323 and T.38 protocol standards. It implements a 'tty' interface \
which resembles a FAX modem. A sample HylaFAX setup is also provided."
LICENSE = "MPL-1.1"

PV = "4.6.0"

RPM_NAME = "t38modem-4.6.0-1.6.aarch64.rpm"
RPM_HASH = "908e36796e508bc1d99b47be6e98193f711c0e0ddd2a045b43d393bf2b509e1300aebbbae8475226668f0e26abd46876f0164c973e7eb792dbd5cf3c85ef43df"

RPROVIDES:${PN} += "t38modem t38modem(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libopal.so.3.18.8()(64bit) libpt.so.2.18.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
