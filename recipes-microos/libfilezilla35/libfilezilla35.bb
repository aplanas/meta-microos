SUMMARY = "C++ library for filezilla"
DESCRIPTION = "libfilezilla is C++ library, offering some basic functionality to \
build high-performing, platform-independent programs. libfilezilla is \
needed for filezilla (an FTP client and server) to build. Some of the \
highlights include: \
 \
* A typesafe, multi-threaded event system. \
* Timers for periodic events. \
* A datetime class that not only tracks timestamp but also their accuracy, \
  which simplifies dealing with timestamps originating from different sources. \
* Simple process handling for spawning child processes with redirected I/O."
LICENSE = "GPL-2.0-or-later"

PV = "0.41.1"

RPM_NAME = "libfilezilla35-0.41.1-1.3.aarch64.rpm"
RPM_HASH = "819d6afb11b2a612d11354c26b9de8bdfb38e3eee0d9624fcb4b0ca9cb306f1ca9a32c333ff84bb11e0ffbd6f1d46c7869d956af75bc4581608f6927ba33fa23"

RPROVIDES:${PN} += "libfilezilla libfilezilla.so.35()(64bit) libfilezilla35 libfilezilla35(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_0)(64bit) libgnutls.so.30(GNUTLS_3_6_3)(64bit) libgnutls.so.30(GNUTLS_3_7_0)(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
