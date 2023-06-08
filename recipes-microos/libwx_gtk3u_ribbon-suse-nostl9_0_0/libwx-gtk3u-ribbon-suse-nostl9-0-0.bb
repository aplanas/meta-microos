SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_ribbon-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "4d553e155ac197b82cab7d80add4cfce5fa1e4e8afc15a98419d975a903be78300721a60aea11fe3b1db262890b677534fee76523842f8edc0362cfc97c3546c"

RPROVIDES:${PN} += "libwx_gtk3u_ribbon-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_ribbon-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_ribbon-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_ribbon-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_ribbon-suse-nostl9_0_0 libwx_gtk3u_ribbon-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
