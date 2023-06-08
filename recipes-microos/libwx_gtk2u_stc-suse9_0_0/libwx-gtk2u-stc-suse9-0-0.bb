SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_stc-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "2d9f388db12914bba1749b5c43310821d3763f4831b16514c691882137fa8c590b18a8e863c8698661682c1987725748c22312304f2c40baf3305f5668a3b978"

RPROVIDES:${PN} += "libwx_gtk2u_stc-suse.so.9.0.0()(64bit) libwx_gtk2u_stc-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_stc-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk2u_stc-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk2u_stc-suse9_0_0 libwx_gtk2u_stc-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk2u_core-suse.so.9.0.0()(64bit) libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
