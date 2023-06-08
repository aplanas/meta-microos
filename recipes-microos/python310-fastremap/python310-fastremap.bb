SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.13.4"

RPM_NAME = "python310-fastremap-1.13.4-1.5.aarch64.rpm"
RPM_HASH = "31b1cb8080c3f971e928c35352b1de3c06883f2eb38ef231a96fe34efa3338c25da5befb5942446109472c1b7679df435507b6709e3aed74bd24cb061262f934"

RPROVIDES:${PN} += "python3-fastremap python3.10dist(fastremap) python310-fastremap python310-fastremap(aarch-64) python3dist(fastremap)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) python(abi) python310-numpy"

inherit rpm
