SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "bb3c88d6edef74f8c5b60445eaf8567a2c0b3bb215f28d99e72ab4e4c87139621289a2b2a6e8a7cd71aae5f769d0367d85281ce1226e784ed8aa52bc86e34c1e"

RPROVIDES:${PN} += "libwx_gtk2u_ribbon-suse.so.9.0.0()(64bit) libwx_gtk2u_ribbon-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_ribbon-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_ribbon-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_ribbon-suse9_0_0 libwx_gtk2u_ribbon-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
