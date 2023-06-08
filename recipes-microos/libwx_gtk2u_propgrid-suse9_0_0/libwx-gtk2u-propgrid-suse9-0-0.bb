SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "42672c286d2bf1a7333a6fb54c1d7607f40c7eb51d6fb534d40d573bc63cbecc449cdd4760c8d43f5d6f7cc9aed94cc0432d0494117432c340366ac61c9f5df4"

RPROVIDES:${PN} += "libwx_gtk2u_propgrid-suse.so.9.0.0()(64bit) libwx_gtk2u_propgrid-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_propgrid-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_propgrid-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_propgrid-suse9_0_0 libwx_gtk2u_propgrid-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
