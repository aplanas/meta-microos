SUMMARY = "Development files for grpc, a HTTP/2 Remote Procedure Call implementation"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the gRPC reference implementation."
LICENSE = "Apache-2.0"

PV = "1.54.1"

RPM_NAME = "grpc-devel-1.54.1-1.1.aarch64.rpm"
RPM_HASH = "61162e6b08cb4da0c3c532a2174c82413cbe4213c0c2f90bada12b77fadb9ab481b1133939072c2d551f6799aeb41fc49e0c9c45e00c76274cf01c7d768a01cb"

RPROVIDES:${PN} += "cmake(gRPC) \
grpc-devel \
grpc-devel(aarch-64) \
pkgconfig(gpr) \
pkgconfig(grpc) \
pkgconfig(grpc++) \
pkgconfig(grpc++_unsecure) \
pkgconfig(grpc_unsecure)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgrpc++1_54 \
libgrpc1_54 \
libgrpc31 \
libgrpc_plugin_support.so.1.54()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libprotoc-3.21.12.so()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libupb31 \
pkgconfig(absl_any_invocable) \
pkgconfig(absl_base) \
pkgconfig(absl_bind_front) \
pkgconfig(absl_cleanup) \
pkgconfig(absl_cord) \
pkgconfig(absl_core_headers) \
pkgconfig(absl_flags) \
pkgconfig(absl_flags_marshalling) \
pkgconfig(absl_flat_hash_map) \
pkgconfig(absl_flat_hash_set) \
pkgconfig(absl_function_ref) \
pkgconfig(absl_hash) \
pkgconfig(absl_inlined_vector) \
pkgconfig(absl_memory) \
pkgconfig(absl_optional) \
pkgconfig(absl_random_random) \
pkgconfig(absl_span) \
pkgconfig(absl_status) \
pkgconfig(absl_statusor) \
pkgconfig(absl_str_format) \
pkgconfig(absl_strings) \
pkgconfig(absl_synchronization) \
pkgconfig(absl_time) \
pkgconfig(absl_type_traits) \
pkgconfig(absl_utility) \
pkgconfig(absl_variant) \
pkgconfig(gpr) \
pkgconfig(grpc) \
pkgconfig(grpc_unsecure) \
pkgconfig(libcares) \
pkgconfig(openssl) \
pkgconfig(re2) \
pkgconfig(zlib)"

inherit rpm
