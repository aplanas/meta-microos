SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_ribbon-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "ef5a4fbe3471fdbc28c9782811af9359b16d4c8179ac050a9d82658bbe3ed98710b4ba14c0268f3f53ce042df26adc592fa5b033d3022960270c65b99f3e72f6"

RPROVIDES:${PN} += "libwx_gtk3u_ribbon-suse.so.9.0.0()(64bit) libwx_gtk3u_ribbon-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_ribbon-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_ribbon-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_ribbon-suse9_0_0 libwx_gtk3u_ribbon-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
