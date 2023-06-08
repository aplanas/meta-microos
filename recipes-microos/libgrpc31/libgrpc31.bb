SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "libgrpc31-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "b106faf9b57f1188b288c64ad545c5b4dcce8b4bd79ce91c1961f61f2f38479472dc7de65a1ad0c3ac2d832fce3af6a208aa1a8cb4c8f0d08b95bc77693244f9"

RPROVIDES:${PN} += "libaddress_sorting.so.31()(64bit) libgpr.so.31()(64bit) libgrpc.so.31()(64bit) libgrpc31 libgrpc31(aarch-64) libgrpc_unsecure.so.31()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_cord.so.2301.0.0()(64bit) libabsl_cordz_info.so.2301.0.0()(64bit) libabsl_flags_internal.so.2301.0.0()(64bit) libabsl_flags_marshalling.so.2301.0.0()(64bit) libabsl_flags_reflection.so.2301.0.0()(64bit) libabsl_hash.so.2301.0.0()(64bit) libabsl_random_internal_pool_urbg.so.2301.0.0()(64bit) libabsl_random_internal_randen.so.2301.0.0()(64bit) libabsl_random_internal_randen_hwaes_impl.so.2301.0.0()(64bit) libabsl_random_internal_randen_slow.so.2301.0.0()(64bit) libabsl_raw_hash_set.so.2301.0.0()(64bit) libabsl_spinlock_wait.so.2301.0.0()(64bit) libabsl_status.so.2301.0.0()(64bit) libabsl_statusor.so.2301.0.0()(64bit) libabsl_str_format_internal.so.2301.0.0()(64bit) libabsl_strings.so.2301.0.0()(64bit) libabsl_synchronization.so.2301.0.0()(64bit) libabsl_time.so.2301.0.0()(64bit) libabsl_time_zone.so.2301.0.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libre2.so.10()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libupb.so.31()(64bit) libz.so.1()(64bit)"

inherit rpm
