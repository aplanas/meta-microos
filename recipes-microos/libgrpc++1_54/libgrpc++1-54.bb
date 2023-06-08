SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "libgrpc++1_54-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "0845b817db46b5ff98bea34b85368a8326497b5795c3896c7752f5544f9919b9a86b27b17d01911c2a0707bac1142683e0f040fef6e2c02c74d1dbbca4e58676"

RPROVIDES:${PN} += "libgrpc++.so.1.54()(64bit) libgrpc++1_54 libgrpc++1_54(aarch-64) libgrpc++_alts.so.1.54()(64bit) libgrpc++_error_details.so.1.54()(64bit) libgrpc++_reflection.so.1.54()(64bit) libgrpc++_unsecure.so.1.54()(64bit) libgrpcpp_channelz.so.1.54()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libabsl_hash.so.2301.0.0()(64bit) libabsl_raw_hash_set.so.2301.0.0()(64bit) libabsl_status.so.2301.0.0()(64bit) libabsl_statusor.so.2301.0.0()(64bit) libabsl_str_format_internal.so.2301.0.0()(64bit) libabsl_strings.so.2301.0.0()(64bit) libabsl_synchronization.so.2301.0.0()(64bit) libabsl_time.so.2301.0.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgpr.so.31()(64bit) libgrpc.so.31()(64bit) libgrpc_unsecure.so.31()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libupb.so.31()(64bit)"

inherit rpm
