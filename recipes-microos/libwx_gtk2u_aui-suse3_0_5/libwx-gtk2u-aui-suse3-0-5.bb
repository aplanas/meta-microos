SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_aui-suse3_0_5-3.0.5.1-3.1.aarch64.rpm"
RPM_HASH = "75d7986a3f8e62c17b8536d92891980006c6b90e9190099b48ec680591ed3c6b80f1e0023833f5ee5b205269ff759b6fe6832edec03d97b03df8a13822a836df"

RPROVIDES:${PN} += "libwx_gtk2u_aui-suse.so.3.0.5()(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_aui-suse3_0_5 libwx_gtk2u_aui-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
