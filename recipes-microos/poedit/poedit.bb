SUMMARY = "Gettext Catalog Editing Tool"
DESCRIPTION = "Poedit is an editor for gettext catalogs (.po files). It is built \
with the wxWidgets toolkit, providing a graphical approach to \
editing catalogs over launching vi and editing the file by hand."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "poedit-3.2.2-1.7.aarch64.rpm"
RPM_HASH = "7ad57c30e6a9eebeaa0e83bc796224e08a88385717f9bfbb007c48e9aef0dd1a3d8648423d32932fca8e8bedf68b9848f593e51c140c2155cddf18fac404ef7f"

RPROVIDES:${PN} += "application() application(net.poedit.Poedit.desktop) application(net.poedit.PoeditURI.desktop) metainfo() metainfo(net.poedit.Poedit.appdata.xml) mimehandler(application/x-gettext) mimehandler(application/x-gettext-translation) mimehandler(application/x-po) mimehandler(application/x-xliff+xml) mimehandler(text/x-gettext-translation) mimehandler(text/x-gettext-translation-template) mimehandler(text/x-po) mimehandler(x-scheme-handler/poedit) poedit poedit(aarch-64)"
RDEPENDS:${PN} += "gettext-tools ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_iostreams.so.1.82.0()(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcld2.so.0()(64bit) libcpprest.so.2.10()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgtkspell3-3.so.0()(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) liblucene++.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpugixml.so.1()(64bit) libsecret-1.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_net-suse.so.9.0.0()(64bit) libwx_baseu_net-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_webview-suse.so.9.0.0()(64bit) libwx_gtk3u_webview-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_xrc-suse.so.9.0.0()(64bit) libwx_gtk3u_xrc-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
