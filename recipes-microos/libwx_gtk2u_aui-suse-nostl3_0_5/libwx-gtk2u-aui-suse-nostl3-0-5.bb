SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "3b020134a32269cfec8e979a923d76bd932531b625d5e903a6f9828a7ae696118b7260db603e4dd64c4fcdc8be1800a3bcb37ff5c0a2310553224e50b5c32b05"

RPROVIDES:${PN} += "libwx_gtk2u_aui-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_aui-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_aui-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_aui-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_aui-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_aui-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_aui-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_aui-suse-nostl3_0_5 libwx_gtk2u_aui-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-x11-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
