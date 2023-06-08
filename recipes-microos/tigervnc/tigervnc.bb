SUMMARY = "An implementation of VNC"
DESCRIPTION = "TigerVNC is an implementation of VNC (Virtual Network Computing), a \
client/server application that allows users to launch and interact \
with graphical applications on remote machines. TigerVNC is capable \
of running 3D and video applications. TigerVNC also provides \
extensions for advanced authentication methods and TLS encryption."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "tigervnc-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "9c78385fe45dd53ca694bf6c05da85a8373c6852da2fd6b0638644aa1ee586ec470ac3b6eaec1002d849dfcca14adc25c9177da3f240599612377b8578c52fea"

RPROVIDES:${PN} += "application() application(vncviewer.desktop) metainfo() metainfo(org.tigervnc.vncviewer.metainfo.xml) tigervnc tigervnc(aarch-64) tightvnc vnc"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXi.so.6()(64bit) libXrandr.so.2()(64bit) libXrender.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libfltk.so.1.3()(64bit) libfltk_images.so.1.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgmp.so.10()(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libgnutls.so.30(GNUTLS_3_6_3)(64bit) libhogweed.so.6()(64bit) libhogweed.so.6(HOGWEED_6)(64bit) libjpeg.so.8()(64bit) libjpeg.so.8(LIBJPEG_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libnettle.so.8()(64bit) libnettle.so.8(NETTLE_8)(64bit) libpixman-1.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit) update-alternatives"

inherit rpm
