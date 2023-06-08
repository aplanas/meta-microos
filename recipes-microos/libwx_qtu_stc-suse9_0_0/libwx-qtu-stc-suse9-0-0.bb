SUMMARY = "wxWidgets styled text class library"
DESCRIPTION = "A wxWidgets implementation of the Scintilla source code editing component."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_stc-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "cdb1e91ce7b51e2280ad167c21320e97b57354055506dd17a7e1118957afb40d6ad7632663360515b56d4ba4115e3d6107896f76beea14268a548372ed30d93c"

RPROVIDES:${PN} += "libwx_qtu_stc-suse.so.9.0.0()(64bit) libwx_qtu_stc-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_stc-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_qtu_stc-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_qtu_stc-suse9_0_0 libwx_qtu_stc-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_core-suse.so.9.0.0()(64bit) libwx_qtu_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
