SUMMARY = "Qt 6 Grpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-grpc-devel-6.5.0-1.3.aarch64.rpm"
RPM_HASH = "45a223f215803eb540d03249fbb11d6cdf8ec2ea4515d00c089b659041986e4669dbdf79122284fe34741a05fb105cd4eacd400240358b160abdbdfc9ef5b062"

RPROVIDES:${PN} += "cmake(Qt6Grpc) cmake(Qt6GrpcTools) pkgconfig(Qt6Grpc) qt6-grpc-devel qt6-grpc-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Network) cmake(Qt6Protobuf) ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Grpc6 libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libprotobuf-3.21.12.so()(64bit) libprotoc-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) pkgconfig(Qt6Core) pkgconfig(Qt6Network) pkgconfig(Qt6Protobuf) pkgconfig(grpc++)"

inherit rpm
