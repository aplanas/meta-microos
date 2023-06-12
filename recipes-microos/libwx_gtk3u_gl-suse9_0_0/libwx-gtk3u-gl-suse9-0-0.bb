SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_gl-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "db9ba518ca627d04fb31a952e1c8a0c2b53d0ed3c099ba1547d3c57b5f829c15d83884d997c82517d260b8bd2cac3442ecf6ea5fe4c112f8c3a1a0c1bcfc5f25"

RPROVIDES:${PN} += "libwx_gtk3u_gl-suse.so.9.0.0()(64bit) libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_gtk3u_gl-suse9_0_0 libwx_gtk3u_gl-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-3.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
