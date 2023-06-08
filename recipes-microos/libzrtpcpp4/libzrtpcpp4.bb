SUMMARY = "A ccrtp extension for ZRTP support"
DESCRIPTION = "A library that adds RFC6189-compliant ZRTP support to the GNU ccRTP \
stack and serves as library for other RTP stacks such as PJSIP and \
GStreamer. ZRTP was developed to allow ad-hoc key negotiation to \
setup Secure RTP (SRTP) sessions."
LICENSE = "GPL-3.0-or-later"

PV = "4.7.0"

RPM_NAME = "libzrtpcpp4-4.7.0-1.11.aarch64.rpm"
RPM_HASH = "66d06248edd8d3c2ea9d8b3aef5964e7addfc0a234a249afd545f83d44566946544c7c6d2ffad8a9ef3a45c7e181512afff784f182f82e3ff40ae397ccbe560b"

RPROVIDES:${PN} += "libzrtpcpp.so.4()(64bit) libzrtpcpp4 libzrtpcpp4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libccrtp.so.3()(64bit) libcommoncpp.so.8()(64bit) libcrypto.so.1.0.0()(64bit) libcrypto.so.1.0.0(OPENSSL_1.0.0)(64bit) libcrypto.so.1.0.0(OPENSSL_1.0.1_EC)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libucommon.so.8()(64bit)"

inherit rpm
