SUMMARY = "Ceph daemon for mirroring RBD images"
DESCRIPTION = "Daemon for mirroring RBD images between Ceph clusters, streaming \
changes asynchronously."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "rbd-mirror-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "9659c1fe402062645c7561347901ba26956cce216476c5ca56d9aeb6d05f78857a4282ca1119cbefa44204fdf94ea12c6faff0b1eb9c582865d0a78ecda31748"

RPROVIDES:${PN} += "rbd-mirror rbd-mirror(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ceph-base ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libceph-common.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcryptsetup.so.12()(64bit) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librados2 librbd1 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtcmalloc.so.4()(64bit)"

inherit rpm
