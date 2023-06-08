SUMMARY = "Netfilter ipset administration utility"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set. \
 \
ipset can: \
* store multiple IP addresses or port numbers and match against the \
  collection by iptables in one swoop; \
* dynamically update iptables rules against IP addresses or ports \
  without performance penalty; \
* express complex IP address and ports based rulesets with one single \
  iptables rule and benefit from the speed of IP sets"
LICENSE = "GPL-2.0-only"

PV = "7.17"

RPM_NAME = "ipset-7.17-1.2.aarch64.rpm"
RPM_HASH = "d69c5374df6ba3b70b8c113d1a854ed3790ba4bf268cf2d30ff4a7424eb7dee9904ddfaab61d664ba8684635da0e516b9cf3afb38cf3399cac82b869c2d3ec29"

RPROVIDES:${PN} += "ipset ipset(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libipset.so.13()(64bit) libipset.so.13(LIBIPSET_2.0)(64bit) libipset.so.13(LIBIPSET_4.11)(64bit) libipset.so.13(LIBIPSET_4.8)(64bit)"

inherit rpm
