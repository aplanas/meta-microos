SUMMARY = "Lossless data compression codec"
DESCRIPTION = "Libraries for encoding/decoding lzham codec files."
LICENSE = "MIT"

PV = "1_0_stable1"

RPM_NAME = "lzham_codec-libs-1_0_stable1-2.19.aarch64.rpm"
RPM_HASH = "bdbcb682c5a37b888491b8f87895aee0f7ee2020b2fefafffdfdc092f556a4b203310fb86c570fb42714e70fb661cf1a2331a330c229f2cbb9f62abc7b7843db"

RPROVIDES:${PN} += "liblzhamcomp.so()(64bit) liblzhamdecomp.so()(64bit) liblzhamdll.so()(64bit) lzham_codec-libs lzham_codec-libs(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit)"

inherit rpm
