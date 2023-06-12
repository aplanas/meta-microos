SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_gl-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "c6bc57c635ceb1d683f11136285b518efdfa456a5427bd484d1c5d88d6cd03c26083d47c5ed1ae8d14cce917bb596f6da1593514967af789be8dcda854c67dfd"

RPROVIDES:${PN} += "libwx_gtk2u_gl-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0.1)(64bit) libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0.2)(64bit) libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0.3)(64bit) libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0.4)(64bit) libwx_gtk2u_gl-suse-nostl.so.3.0.5(WXU_3.0.5)(64bit) libwx_gtk2u_gl-suse-nostl3_0_5 libwx_gtk2u_gl-suse-nostl3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgdk-x11-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.3.0.5()(64bit) libwx_baseu-suse-nostl.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) libwx_gtk2u_core-suse-nostl.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
