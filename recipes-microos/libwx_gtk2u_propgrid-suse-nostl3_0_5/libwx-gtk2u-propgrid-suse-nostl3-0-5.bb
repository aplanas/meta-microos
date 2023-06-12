SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_propgrid-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "2fa7c663ad113ca6a37b2e7e64de577689d276856aebe73e1d6bd769acf3908dfe72bcd46b3f644ab422ef47b13ba4bead581046fc265e7a095db9028af48857"

RPROVIDES:${PN} += "libwx_gtk2u_propgrid-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_propgrid-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_propgrid-suse-nostl3_0_5 libwx_gtk2u_propgrid-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
