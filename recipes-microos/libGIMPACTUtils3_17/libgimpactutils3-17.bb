SUMMARY = "Bullet GIMPACT Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libGIMPACTUtils3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "614512a9020938c7a7b9d93fff26f55263af8f76935d98fb2c7c19a1837e9c5dd38318245920f181074f14788797e546eed9fd2a031cb36eac93544618df362c"

RPROVIDES:${PN} += "libGIMPACTUtils.so.3.17()(64bit) \
libGIMPACTUtils3_17 \
libGIMPACTUtils3_17(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libBulletCollision.so.3.17()(64bit) \
libConvexDecomposition.so.3.17()(64bit) \
libLinearMath.so.3.17()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
