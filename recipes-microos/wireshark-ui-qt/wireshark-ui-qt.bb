SUMMARY = "A Network Traffic Analyser - Qt UI"
DESCRIPTION = "This package contains the Qt based UI for Wireshark."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "4.0.5"

RPM_NAME = "wireshark-ui-qt-4.0.5-1.1.aarch64.rpm"
RPM_HASH = "37aae22be5459408638a7df2de6360b1cd26ee9b1e3e4fa0fb92589c199d7366f90f9dbe38f475fef66d3c7f20ee03bd525441d828294ce2a3cc53b62f5c6ca1"

RPROVIDES:${PN} += "application() application(org.wireshark.Wireshark-su.desktop) application(org.wireshark.Wireshark.desktop) metainfo() metainfo(org.wireshark.Wireshark.metainfo.xml) mimehandler(application/ipfix) mimehandler(application/vnd.tcpdump.pcap) mimehandler(application/x-5view) mimehandler(application/x-apple-packetlogger) mimehandler(application/x-endace-erf) mimehandler(application/x-etherpeek) mimehandler(application/x-iptrace) mimehandler(application/x-ixia-vwr) mimehandler(application/x-lanalyzer) mimehandler(application/x-micropross-mplog) mimehandler(application/x-netinstobserver) mimehandler(application/x-nettl) mimehandler(application/x-pcapng) mimehandler(application/x-radcom) mimehandler(application/x-snoop) mimehandler(application/x-tektronix-rf5) mimehandler(application/x-visualnetworks) wireshark-ui wireshark-ui-gtk wireshark-ui-qt wireshark-ui-qt(aarch-64)"
RDEPENDS:${PN} += "/bin/sh hicolor-icon-theme ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Multimedia.so.5()(64bit) libQt5Multimedia.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libminizip.so.1()(64bit) libnl-3.so.200()(64bit) libnl-3.so.200(libnl_3)(64bit) libnl-genl-3.so.200()(64bit) libnl-genl-3.so.200(libnl_3)(64bit) libnl-route-3.so.200()(64bit) libnl-route-3.so.200(libnl_3)(64bit) libpcap.so.1()(64bit) libpcre2-8.so.0()(64bit) libspeexdsp.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwireshark.so.16()(64bit) libwiretap.so.13()(64bit) libwsutil.so.14()(64bit) libz.so.1()(64bit) wireshark xdg-utils"

inherit rpm
