SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.23"

RPM_NAME = "xtables-addons-3.23-1.18.aarch64.rpm"
RPM_HASH = "49886f165d6d6bd25a470a12b0b9d3e893d48f99d3e2888baf4ca546a6a483ebe6a4febdc00797eac962d2cf62424897bd98f7747d06f8507118f6dc520a5eaf"

RPROVIDES:${PN} += "libxt_ACCOUNT.so()(64bit) libxt_ACCOUNT_cl.so.1()(64bit) libxt_CHAOS.so()(64bit) libxt_DELUDE.so()(64bit) libxt_DHCPMAC.so()(64bit) libxt_DNETMAP.so()(64bit) libxt_ECHO.so()(64bit) libxt_IPMARK.so()(64bit) libxt_LOGMARK.so()(64bit) libxt_PROTO.so()(64bit) libxt_SYSRQ.so()(64bit) libxt_TARPIT.so()(64bit) libxt_asn.so()(64bit) libxt_condition.so()(64bit) libxt_dhcpmac.so()(64bit) libxt_fuzzy.so()(64bit) libxt_geoip.so()(64bit) libxt_gradm.so()(64bit) libxt_iface.so()(64bit) libxt_ipp2p.so()(64bit) libxt_ipv4options.so()(64bit) libxt_length2.so()(64bit) libxt_lscan.so()(64bit) libxt_pknock.so()(64bit) libxt_psd.so()(64bit) libxt_quota2.so()(64bit) xtables-addons xtables-addons(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /sbin/ldconfig /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libxtables.so.12()(64bit) perl(Getopt::Long) perl(Net::CIDR::Lite) perl(Socket) perl(Text::CSV_XS) perl(strict) perl(warnings)"

inherit rpm
