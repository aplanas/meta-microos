SUMMARY = "C++ library for accessing sonos devices"
DESCRIPTION = "C++ library for accessing sonos devices \
The API supports basic features to browse music index and control playback \
in any zones."
LICENSE = "GPL-3.0-or-later"

PV = "2.10.2"

RPM_NAME = "libnoson2-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "edaea1e20b325e8edfcd8858e7abbb8da0b5004703fa51f6204a0e58dc385322405e44e16a8321fd210f6ec9f47c96bdc7888a0c1e2f639c6561b6378d43f94f"

RPROVIDES:${PN} += "libnoson.so.2()(64bit) libnoson2 libnoson2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFLAC++.so.10()(64bit) libFLAC.so.12()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libz.so.1()(64bit)"

inherit rpm
