SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_net-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "c1af351395d583037982631a80016e958d3cad6b4754511fe17659563b6be83918bbfa40fec5dc8038cf42df9c1a085aa5c8318c5b2b280a6bec32706042520b"

RPROVIDES:${PN} += "libwx_baseu_net-suse-nostl.so.3.0.5()(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_baseu_net-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_baseu_net-suse-nostl3_0_5 libwx_baseu_net-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
