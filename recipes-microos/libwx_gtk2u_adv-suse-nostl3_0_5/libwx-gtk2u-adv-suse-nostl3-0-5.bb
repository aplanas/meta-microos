SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_adv-suse-nostl3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "df0114cbf9edb23fcd42841213e8a5c455c321e7ecddce1bf4e5cf8069edbf9a929cf1eedc82a260c12f42162fa1deee42d9b5b8c95e3940461c1047c64d1913"

RPROVIDES:${PN} += "libwx_gtk2u_adv-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_adv-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_adv-suse-nostl3_0_5 libwx_gtk2u_adv-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
