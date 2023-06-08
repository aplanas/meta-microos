SUMMARY = "GTK client for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links. \
 \
This package contains a graphical user interface to transmission."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.0.3"

RPM_NAME = "transmission-gtk-4.0.3-1.1.aarch64.rpm"
RPM_HASH = "6c56ef11b1e12fb97ded94be12a1aa966d287dbde1793436ae3ab17df824be16dab8e428d70030291684f4e81e26ec122e6cb3a0f9e6b270811b99e45f8a90ae"

RPROVIDES:${PN} += "application() application(transmission-gtk.desktop) metainfo() metainfo(transmission-gtk.metainfo.xml) mimehandler(application/x-bittorrent) mimehandler(x-scheme-handler/magnet) transmission-gtk transmission-gtk(aarch-64) transmission-ui"
RDEPENDS:${PN} += "/bin/sh canberra-gtk-play ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libb64.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairomm-1.16.so.1()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libdeflate.so.0()(64bit) libevent-2.1.so.7()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libgio-2.0.so.0()(64bit) libgiomm-2.68.so.1()(64bit) libglib-2.0.so.0()(64bit) libglibmm-2.68.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libgtkmm-4.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libminiupnpc.so.17()(64bit) libpangomm-2.48.so.1()(64bit) libpsl.so.5()(64bit) libsigc-3.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) transmission-common update-alternatives"

inherit rpm
