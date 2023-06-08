SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_stc-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "a61ad81a8df2355ce65f0f27cdb54429c04e3f8633b4d2c6402471654ebfac0434a495362b33603a3df914f3015cb037411358a7965f33b682990b7cf8691f7c"

RPROVIDES:${PN} += "libwx_gtk3u_stc-suse.so.9.0.0()(64bit) libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_stc-suse9_0_0 libwx_gtk3u_stc-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
