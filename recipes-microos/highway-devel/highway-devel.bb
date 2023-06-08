SUMMARY = "Development files for Highway"
DESCRIPTION = "Highway is a C++ library that provides portable SIMD/vector intrinsics. \
 \
Development files for Highway."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "highway-devel-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "7ebe2f36c312790f988773f9ce4ab46445f527584a6b70eb8834e0e3d628c81bc7818d1ae7c2c590e28f24e68598f36b1a077c33c6e55056c4bf0aef462c0c8a"

RPROVIDES:${PN} += "cmake(hwy) highway-devel highway-devel(aarch-64) pkgconfig(libhwy) pkgconfig(libhwy-contrib) pkgconfig(libhwy-test)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libhwy1 pkgconfig(gtest)"

inherit rpm
