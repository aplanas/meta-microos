SUMMARY = "wxWidgets advanced user interface docking library"
DESCRIPTION = "The Advanced User Interface docking library of wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_aui-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "1ed4ae0daeb0d35e0436b19f1d55039b59af103cd99bfd74a4da1dfa6629ab2c69da2e87cc3a840059b8e1e71915bb3b46e8446a5b675833805505c9ac4f3f02"

RPROVIDES:${PN} += "libwx_gtk3u_aui-suse.so.9.0.0()(64bit) libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_aui-suse9_0_0 libwx_gtk3u_aui-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
