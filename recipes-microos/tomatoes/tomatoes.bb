SUMMARY = "How many tomatoes can you smash in ten short minutes?"
DESCRIPTION = "I Have No Tomatoes is an extreme leisure time activity idea of which \
culminates in the following question: How many tomatoes can you smash \
in ten short minutes? If you have the time to spare, this game has the \
vegetables just waiting to beeliminated!"
LICENSE = "Zlib"

PV = "1.55"

RPM_NAME = "tomatoes-1.55-2.23.aarch64.rpm"
RPM_HASH = "666992dfe17e296cb4e059d26d956dec71ca512ec24695e50997d91e5c9d9f793d3b362a4cd56507631c0902de372b9af9525599c2d4edd7a8f41c99ea27b730"

RPROVIDES:${PN} += "application() \
application(tomatoes.desktop) \
config(tomatoes) \
tomatoes \
tomatoes(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
