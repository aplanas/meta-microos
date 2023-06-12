SUMMARY = "Network grep"
DESCRIPTION = "ngrep strives to provide most of GNU grep's common features, applying them \
to the network layer. ngrep is a pcap-aware tool that allows you to specify \
extended regular or hexadecimal expressions to match against data payloads \
of packets. It currently recognizes IPv4/6, TCP, UDP, ICMPv4/6, IGMP and \
Raw across Ethernet, PPP, SLIP, FDDI, Token Ring and null interfaces, and \
understands BPF filter logic in the same fashion as more common packet \
sniffing tools, such as tcpdump and snoop."
LICENSE = "BSD-4-Clause"

PV = "1.47"

RPM_NAME = "ngrep-1.47-2.3.aarch64.rpm"
RPM_HASH = "abfa93338adf84070fef53d871ab85571014b3582f218ee524b7cba83427b35eae4fd1a40cee712d77b4d46ea7e5a8fbb4376fd7b01a9c003f1c4a77400b6b9b"

RPROVIDES:${PN} += "ngrep \
ngrep(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libpcap.so.1()(64bit) \
libpcre2-8.so.0()(64bit)"

inherit rpm
