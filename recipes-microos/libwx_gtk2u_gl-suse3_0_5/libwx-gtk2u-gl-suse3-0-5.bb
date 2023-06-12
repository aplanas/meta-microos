SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_gl-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "b78248addd191d846a2f59ece2745952e3d49ce38dc92b0d78684ef89e4b9322a892ed808dc94e41a0e37a0eb4bf636b546002d752e08208f4bf6283b8654e11"

RPROVIDES:${PN} += "libwx_gtk2u_gl-suse.so.3.0.5()(64bit) libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_gl-suse.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_gl-suse3_0_5 libwx_gtk2u_gl-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
