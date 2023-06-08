SUMMARY = "RADOS block device client library"
DESCRIPTION = "RBD is a block device striped across multiple distributed objects in \
RADOS, a reliable, autonomic distributed object storage cluster \
developed as part of the Ceph distributed storage system. This is a \
shared library allowing applications to manage these block devices."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "librbd1-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "7484bcdf4edce196bca6b483804501096d26d379eb18e1c0a9db6a32b939167ddb5b8d34b1f72d34b8e2e2cd55cb8c473dd443a5ea06af9052b1d65c8dece10a"

RPROVIDES:${PN} += "libceph_librbd_parent_cache.so.1()(64bit) libceph_librbd_pwl_cache.so.1()(64bit) librbd.so.1()(64bit) librbd1 librbd1(aarch-64) librbd_tp.so.1()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig coreutils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libaio.so.1()(64bit) libaio.so.1(LIBAIO_0.1)(64bit) libaio.so.1(LIBAIO_0.4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libceph-common.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcryptsetup.so.12()(64bit) libcryptsetup.so.12(CRYPTSETUP_2.0)(64bit) libcryptsetup.so.12(CRYPTSETUP_2.4)(64bit) libfmt.so.9()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) liblttng-ust.so.1()(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librados2 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
