SUMMARY = "wxWidgets OpenGL integration library"
DESCRIPTION = "This library contains the wxGLCanvas class for integration of OpenGL \
with wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_gl-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "a6524444e78c18810530b38efeb027d9cea83e83e4f0ddf16991fe3a117135ceca90ab6e81bf365291bc51b48198c33dc95717ef9f2a19bfaafee447074e3463"

RPROVIDES:${PN} += "libwx_qtu_gl-suse.so.9.0.0()(64bit) \
libwx_qtu_gl-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_qtu_gl-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_qtu_gl-suse.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_qtu_gl-suse9_0_0 \
libwx_qtu_gl-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5OpenGL.so.5()(64bit) \
libQt5OpenGL.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
