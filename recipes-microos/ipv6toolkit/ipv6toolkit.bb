SUMMARY = "Security assessment and troubleshooting tool for the IPv6 protocols"
DESCRIPTION = "SI6 Networks's IPv6 toolkit is a set of IPv6 security and \
trouble-shooting tools that can send arbitrary IPv6-based \
packets. \
 \
List of tools: \
 * addr6: An IPv6 address analysis and manipulation tool. \
 * flow6: A tool to perform a security asseessment of the IPv6 Flow \
   Label. \
 * frag6: A tool to perform IPv6 fragmentation-based attacks and to \
   perform a security assessment of a number of fragmentation-related \
   aspects. \
 * icmp6: A tool to perform attacks based on ICMPv6 error messages. \
 * jumbo6: A tool to assess potential flaws in the handling of IPv6 \
   Jumbograms. \
 * na6: A tool to send arbitrary Neighbor Advertisement messages. \
 * ni6: A tool to send arbitrary ICMPv6 Node Information messages, \
    and assess possible flaws in the processing of such packets. \
 * ns6: A tool to send arbitrary Neighbor Solicitation messages. \
 * ra6: A tool to send arbitrary Router Advertisement messages. \
 * rd6: A tool to send arbitrary ICMPv6 Redirect messages. \
 * rs6: A tool to send arbitrary Router Solicitation messages. \
 * scan6: An IPv6 address scanning tool. \
 * tcp6: A tool to send arbitrary TCP segments and perform a variety \
   of TCP-based attacks."
LICENSE = "GPL-3.0-or-later"

PV = "2.0"

RPM_NAME = "ipv6toolkit-2.0-3.12.aarch64.rpm"
RPM_HASH = "d018c91c617400b013d538bf37700211185a75a1c8b21999d20aa5289841fe09cd21337ea31d6d75b879c664a2f64fd5b592516d1b4aefce96d3333c5c567b42"

RPROVIDES:${PN} += "config(ipv6toolkit) ipv6toolkit ipv6toolkit(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libpcap.so.1()(64bit)"

inherit rpm
