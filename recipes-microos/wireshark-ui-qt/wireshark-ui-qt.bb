SUMMARY = "A Network Traffic Analyser - Qt UI"
DESCRIPTION = "This package contains the Qt based UI for Wireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.6"

RPM_NAME = "wireshark-ui-qt-4.0.6-1.1.aarch64.rpm"
RPM_HASH = "385698366a3d3a3d7bbe03fa51715462a9090129cf2ffb651416a5b122361540e8b73da901eb2ffa9ffdeb65ddb8b72707351b4e9d796a1b548282329a17e59f"

RPROVIDES:${PN} += "application() \
application(org.wireshark.Wireshark-su.desktop) \
application(org.wireshark.Wireshark.desktop) \
metainfo() \
metainfo(org.wireshark.Wireshark.metainfo.xml) \
mimehandler(application/ipfix) \
mimehandler(application/vnd.tcpdump.pcap) \
mimehandler(application/x-5view) \
mimehandler(application/x-apple-packetlogger) \
mimehandler(application/x-endace-erf) \
mimehandler(application/x-etherpeek) \
mimehandler(application/x-iptrace) \
mimehandler(application/x-ixia-vwr) \
mimehandler(application/x-lanalyzer) \
mimehandler(application/x-micropross-mplog) \
mimehandler(application/x-netinstobserver) \
mimehandler(application/x-nettl) \
mimehandler(application/x-pcapng) \
mimehandler(application/x-radcom) \
mimehandler(application/x-snoop) \
mimehandler(application/x-tektronix-rf5) \
mimehandler(application/x-visualnetworks) \
wireshark-ui \
wireshark-ui-gtk \
wireshark-ui-qt \
wireshark-ui-qt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Multimedia.so.5()(64bit) \
libQt5Multimedia.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcrypt.so.20()(64bit) \
libgcrypt.so.20(GCRYPT_1.6)(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libminizip.so.1()(64bit) \
libnl-3.so.200()(64bit) \
libnl-3.so.200(libnl_3)(64bit) \
libnl-genl-3.so.200()(64bit) \
libnl-genl-3.so.200(libnl_3)(64bit) \
libnl-route-3.so.200()(64bit) \
libnl-route-3.so.200(libnl_3)(64bit) \
libpcap.so.1()(64bit) \
libpcre2-8.so.0()(64bit) \
libspeexdsp.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libwireshark.so.16()(64bit) \
libwiretap.so.13()(64bit) \
libwsutil.so.14()(64bit) \
libz.so.1()(64bit) \
wireshark \
xdg-utils"

inherit rpm
