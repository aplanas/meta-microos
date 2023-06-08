SUMMARY = "GeoIP backend for pdns"
DESCRIPTION = "The PowerDNS Nameserver is a authoritative-only nameserver. \
It conforms to contemporary DNS standards documents. \
 \
This package holds the GeoIP backend for pdns."
LICENSE = "GPL-2.0-only"

PV = "4.7.3"

RPM_NAME = "pdns-backend-geoip-4.7.3-2.4.aarch64.rpm"
RPM_HASH = "a930005cc6b7779ea36407deaaff9b58da91e02b82b9ca64a81bc3ec3d2a59aca66a63144773e849933a55731172e6930ba6e8c4d6550511823ebaff837babd7"

RPROVIDES:${PN} += "libgeoipbackend.so()(64bit) pdns-backend-geoip pdns-backend-geoip(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmaxminddb.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libyaml-cpp.so.0.7()(64bit) pdns"

inherit rpm
