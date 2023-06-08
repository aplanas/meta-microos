SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "fdaed09915c7146730a389ef085bef599af98a1f42496838b3d2bb908fc95c5b743051f2ed6e16686285eb45439af618b55cfe78e02027af1f19e7e95c758a58"

RPROVIDES:${PN} += "libwx_gtk2u_adv-suse.so.3.0.5()(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_adv-suse3_0_5 libwx_gtk2u_adv-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
