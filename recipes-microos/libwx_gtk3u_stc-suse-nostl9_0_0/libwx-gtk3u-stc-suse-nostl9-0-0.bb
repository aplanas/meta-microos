SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_stc-suse-nostl9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "89ff2ecfba5288782cdf602a430dbf2a8b517d7a1bfda7df9a7a334aa4ac8eb1f09e0f2dd0583e79479efd96b8bf853e1439bc9e3d5afba97cea047b21beb9cf"

RPROVIDES:${PN} += "libwx_gtk3u_stc-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_stc-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_stc-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_stc-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_stc-suse-nostl9_0_0 libwx_gtk3u_stc-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
