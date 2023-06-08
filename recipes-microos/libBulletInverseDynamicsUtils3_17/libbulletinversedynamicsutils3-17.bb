SUMMARY = "Bullet Inverse Dynamics Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.17"

RPM_NAME = "libBulletInverseDynamicsUtils3_17-3.17-1.9.aarch64.rpm"
RPM_HASH = "32f57172b6d7242a2a9cca93334fd5b8730666d5ba339e372f0203fa0033e9d72a3def6317039b27f1214c31f9071bf7d490eb8548d1a03cc2bcc04bf1076954"

RPROVIDES:${PN} += "libBulletInverseDynamicsUtils.so.3.17()(64bit) libBulletInverseDynamicsUtils3_17 libBulletInverseDynamicsUtils3_17(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libBullet3Common.so.3.17()(64bit) libBulletCollision.so.3.17()(64bit) libBulletDynamics.so.3.17()(64bit) libBulletInverseDynamics.so.3.17()(64bit) libLinearMath.so.3.17()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
