SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_gl-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "583ab9d009a2f6e6cac08af5678f7a1e37589550347b9751d0819d42efe662729bb81b1c7bb9453f9b0e936fd1ca963ed7fb9681081e2eb7c3a213d209e5e7a6"

RPROVIDES:${PN} += "libwx_gtk3u_gl-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_gl-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_gl-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_gl-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_gl-suse-nostl9_0_0 libwx_gtk3u_gl-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse-nostl.so.9.0.0()(64bit) libwx_baseu-suse-nostl.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0()(64bit) libwx_gtk3u_core-suse-nostl.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
