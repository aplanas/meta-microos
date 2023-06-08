SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "0b6165ce9c98da5282d969d6bc271306931d59511920d2cbee6050a848264e304d63cf4a2e0c6550a6596df9fee300cf5e15358629ba5cfacae8c792f6fea0f8"

RPROVIDES:${PN} += "libwx_gtk2u_propgrid-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_propgrid-suse-nostl3_0_5 libwx_gtk2u_propgrid-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
