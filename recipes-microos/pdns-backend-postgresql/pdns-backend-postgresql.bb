SUMMARY = "PostgreSQL backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the PostgreSQL backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.7.3"

RPM_NAME = "pdns-backend-postgresql-4.7.3-2.4.aarch64.rpm"
RPM_HASH = "27a72dc1fc675da0aef0e822c5422ffe4b2353eabb9fbc8993c98180128fb6485ab53d3274f6c98398482b1edcf1738aab2e1e96bd286cb011e3e1e5440394d3"

RPROVIDES:${PN} += "libgpgsqlbackend.so()(64bit) pdns-backend-postgresql pdns-backend-postgresql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libpq.so.5()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) pdns"

inherit rpm
