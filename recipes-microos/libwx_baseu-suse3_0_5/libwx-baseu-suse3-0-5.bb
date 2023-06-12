SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "78d78d86ab835561f479ee55fecd1a5c46766bb95421b4fd27cc6aaeb803d94d58343e1b1d6cccea7a0a74913730ca9cbc7e737b54b38bde85bfda0caecd9d39"

RPROVIDES:${PN} += "libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_baseu-suse3_0_5 libwx_baseu-suse3_0_5(aarch-64) wxWidgets"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
