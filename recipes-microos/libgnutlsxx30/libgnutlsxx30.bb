SUMMARY = "C++ API for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS library provides a secure layer over a reliable transport \
layer. Currently the GnuTLS library implements the proposed standards \
of the IETF's TLS working group."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.0"

RPM_NAME = "libgnutlsxx30-3.8.0-1.1.aarch64.rpm"
RPM_HASH = "114b92fe9b50d2505ff692b437ebea5ccd7deabf9deb4cf0f6150227c7f84f7a68bf522f9b9f538ec329c97f3c9718f7ac58b08158f2975b1c4628d3ca01a20a"

RPROVIDES:${PN} += "libgnutlsxx.so.30()(64bit) libgnutlsxx30 libgnutlsxx30(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig crypto-policies ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
