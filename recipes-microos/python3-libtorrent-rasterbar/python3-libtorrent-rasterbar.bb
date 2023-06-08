SUMMARY = "Python Bindings for libtorrent-rasterbar"
DESCRIPTION = "Python Bindings for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.8"

RPM_NAME = "python3-libtorrent-rasterbar-2.0.8-2.2.aarch64.rpm"
RPM_HASH = "4d9000d07f6d42fa3917f76d869b04bd42704f0c2bac8c7163973e6ec2dffac3b273d48bdab97a11321078f3e968a8cb8bbf1783a41c17e0ccb0b2eba656997f"

RPROVIDES:${PN} += "libtorrent.cpython-310-aarch64-linux-gnu.so()(64bit) python3-libtorrent-rasterbar python3-libtorrent-rasterbar(aarch-64) python3.10dist(libtorrent) python3dist(libtorrent)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_python-py3.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libtorrent-rasterbar.so.2.0()(64bit) python(abi)"

inherit rpm
