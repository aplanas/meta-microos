SUMMARY = "The 'Phoenix' variant of the wxWidgets Python bindings"
DESCRIPTION = "Phoenix is a reimplementation of wxPython. Like the 'classic' \
wxPython, Phoenix wraps the wxWidgets C++ toolkit and provides access \
to the user interface portions of the wxWidgets API, enabling Python \
applications to have a GUI on Windows, macOS or Unix-like systems, \
with a native look and feel and requiring very little (if any) \
platform specific code."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "python310-wxPython-4.2.0-4.5.aarch64.rpm"
RPM_HASH = "bce4317651d0972d94594d4fe228aa42a5f4f3afa562ff5bcf102400323e0f6985bdc86581d46abe5a2356e227cd215375a907842f5ff568562f13ce578c3ed3"

RPROVIDES:${PN} += "python3-wxPython \
python3-wxWidgets \
python3.10dist(wxpython) \
python310-wxPython \
python310-wxPython(aarch-64) \
python310-wxWidgets \
python3dist(wxpython)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_net-suse.so.9.0.0()(64bit) \
libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_baseu_xml-suse.so.9.0.0()(64bit) \
libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0()(64bit) \
libwx_gtk3u_aui-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0()(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0()(64bit) \
libwx_gtk3u_gl-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_html-suse.so.9.0.0()(64bit) \
libwx_gtk3u_html-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_media-suse.so.9.0.0()(64bit) \
libwx_gtk3u_media-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_propgrid-suse.so.9.0.0()(64bit) \
libwx_gtk3u_propgrid-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_ribbon-suse.so.9.0.0()(64bit) \
libwx_gtk3u_ribbon-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0()(64bit) \
libwx_gtk3u_richtext-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0()(64bit) \
libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0()(64bit) \
libwx_gtk3u_xrc-suse.so.9.0.0(WXU_3.2)(64bit) \
python(abi) \
python310-six \
update-alternatives"

inherit rpm
