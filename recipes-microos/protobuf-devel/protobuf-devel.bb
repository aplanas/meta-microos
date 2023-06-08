SUMMARY = "Header files, libraries and development documentation for protobuf"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "21.12"

RPM_NAME = "protobuf-devel-21.12-3.1.aarch64.rpm"
RPM_HASH = "e5af1df1776a36903e50ff3637c36597b1d4d50dc7b3a0bd414255c38cbe53fd50383b4d066a5d798901b8bc9ad7761e8e289866d7758bbcb8e9b9ceec1d53da"

RPROVIDES:${PN} += "libprotobuf-devel pkgconfig(protobuf) pkgconfig(protobuf-lite) protobuf-devel protobuf-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config gcc-c++ ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libprotobuf-lite3_21_12 libprotobuf3_21_12 libprotoc-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) pkgconfig(zlib)"

inherit rpm
