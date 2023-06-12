SUMMARY = "UDP over TCP/ICMP/UDP tunnel"
DESCRIPTION = "A tunnel which turns UDP traffic into encrypted UDP/FakeTCP/ICMP traffic \
by using raw sockets that can help bypass UDP firewalls (or \
unstable UDP environments)."
LICENSE = "MIT"

PV = "20200818.0"

RPM_NAME = "udp2raw-tunnel-20200818.0-2.3.aarch64.rpm"
RPM_HASH = "cb5e9c5115b384c1ec9e580fc0e50862a9e0072e7bc74fe7132043a1968a107d7d7bb49cd2a34414016e117cbd2a1349ef99000434778fa7c4d6e9ee14d33dbb"

RPROVIDES:${PN} += "config(udp2raw-tunnel) \
udp2raw-tunnel \
udp2raw-tunnel(aarch-64)"
RDEPENDS:${PN} += "iptables \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
