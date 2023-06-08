SUMMARY = "Evolution Data Server's Address Book Client Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library to access address books."
LICENSE = "LGPL-2.0-only"

PV = "3.48.1"

RPM_NAME = "libebook-contacts-1_2-4-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "32e61a21aa9018c17650f9a0c81d8a1bb4d078b502c2744ede1b71cefed8f4b5b60b59b56595867622c5336b04bc1ecc4c1b4ccba21b43000ed74aa3fd2c9b55"

RPROVIDES:${PN} += "libebook-contacts-1.2.so.4()(64bit) libebook-contacts-1_2-4 libebook-contacts-1_2-4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcamel-1.2.so.64()(64bit) libedataserver-1.2.so.27()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libphonenumber.so.8()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
