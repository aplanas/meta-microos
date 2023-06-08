SUMMARY = "ODBC backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the ODBC backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.7.3"

RPM_NAME = "pdns-backend-godbc-4.7.3-2.4.aarch64.rpm"
RPM_HASH = "1c135b98f4c9ddea55193450a9fd41e9f831cbfa037f38519357f35b56aa1de782fe6c74e852349ece275456d63a2cb951057dda95c11ad2f64875bc218dccfe"

RPROVIDES:${PN} += "libgodbcbackend.so()(64bit) pdns-backend-godbc pdns-backend-godbc(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libodbc.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) pdns"

inherit rpm
