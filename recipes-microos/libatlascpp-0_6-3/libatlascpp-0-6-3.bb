SUMMARY = "Remote protocol for the Worldforge MMORPG system"
DESCRIPTION = "This library implements the Atlas protocol for use in client-server \
game applications. It is the standard implementation used by games written \
by the WorldForge project. This library is suitable for linking to either \
clients or servers."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only"

PV = "0.6.4"

RPM_NAME = "libatlascpp-0_6-3-0.6.4-2.6.aarch64.rpm"
RPM_HASH = "8cafb930abe44d70c0209c0868c00e7c74783e4c50a7bc89c40258e51c199f23e9cd057a0d399571afef3cc5933ddb60ac9ed7c1f29a4c2b94fcf4b8c9c0d79c"

RPROVIDES:${PN} += "libAtlas-0.6.so.3()(64bit) libAtlasCodecs-0.6.so.3()(64bit) libAtlasFilters-0.6.so.3()(64bit) libAtlasFunky-0.6.so.3()(64bit) libAtlasMessage-0.6.so.3()(64bit) libAtlasNet-0.6.so.3()(64bit) libAtlasObjects-0.6.so.3()(64bit) libatlascpp-0_6-3 libatlascpp-0_6-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
