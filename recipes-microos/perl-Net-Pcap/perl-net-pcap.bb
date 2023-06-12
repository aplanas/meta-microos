SUMMARY = "Interface to the pcap(3) LBL packet capture library"
DESCRIPTION = "'Net::Pcap' is a Perl binding to the LBL pcap(3) library and its Win32 \
counterpart, the WinPcap library. Pcap (packet capture) is a portable API \
to capture network packet: it allows applications to capture packets at \
link-layer, bypassing the normal protocol stack. It also provides features \
like kernel-level packet filtering and access to internal statistics. \
 \
Common applications include network statistics collection, security \
monitoring, network debugging, etc."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.21"

RPM_NAME = "perl-Net-Pcap-0.21-1.3.aarch64.rpm"
RPM_HASH = "6d261d50432932a23ef5b655f699cccdd45717f0d034ee8a29783e0aecb3105c946a37290b0c942441791f79af925fd1fe38f95afe2f4b7bf37af43e0d7f3e12"

RPROVIDES:${PN} += "perl(Net::Pcap) \
perl-Net-Pcap \
perl-Net-Pcap(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libpcap.so.1()(64bit) \
perl(:MODULE_COMPAT_5.36.0) \
perl(Data::Hexdumper) \
perl(NetPacket)"

inherit rpm
