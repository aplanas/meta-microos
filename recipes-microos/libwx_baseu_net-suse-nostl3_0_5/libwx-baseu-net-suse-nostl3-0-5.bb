SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_net-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "c0f86914ebb16872168823ee5f564344d7ffba0ca60629294786a7a61c6ceb6801ddc6a24fe93fc6b3ce2cf61d3901a32f2fbffa0db0f8e7303ca4c453842dd0"

RPROVIDES:${PN} += "libwx_baseu_net-suse-nostl.so.3.0.5()(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_baseu_net-suse-nostl3_0_5 libwx_baseu_net-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
