SUMMARY = "SQLite 3 backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the SQLite 3 backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.7.3"

RPM_NAME = "pdns-backend-sqlite3-4.7.3-2.4.aarch64.rpm"
RPM_HASH = "77db8913b489945a4b508b72ee60fe2abfa08ee13ee391ca59b915ae62220657093d14be0d0a3a67a34319b011f38e1f54e6938b2871da82c058637b3aad4296"

RPROVIDES:${PN} += "libgsqlite3backend.so()(64bit) pdns-backend-sqlite3 pdns-backend-sqlite3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) pdns"

inherit rpm
