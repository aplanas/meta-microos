SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.24_k6.3.4_1"

RPM_NAME = "xtables-addons-kmp-64kb-3.24_k6.3.4_1-1.3.aarch64.rpm"
RPM_HASH = "ce1babb53034bb26b3c91bb2aa65a6f7fe07c29a3e9eae2fe1312943a837f620d30cd08854543d1eedc4fce494e46999c042284eeb737d890cc96d3dd5056f72"

RPROVIDES:${PN} += "kmod(compat_xtables.ko) kmod(xt_ACCOUNT.ko) kmod(xt_CHAOS.ko) kmod(xt_DELUDE.ko) kmod(xt_DHCPMAC.ko) kmod(xt_DNETMAP.ko) kmod(xt_ECHO.ko) kmod(xt_IPMARK.ko) kmod(xt_LOGMARK.ko) kmod(xt_PROTO.ko) kmod(xt_SYSRQ.ko) kmod(xt_TARPIT.ko) kmod(xt_asn.ko) kmod(xt_condition.ko) kmod(xt_fuzzy.ko) kmod(xt_geoip.ko) kmod(xt_iface.ko) kmod(xt_ipp2p.ko) kmod(xt_ipv4options.ko) kmod(xt_length2.ko) kmod(xt_lscan.ko) kmod(xt_pknock.ko) kmod(xt_psd.ko) kmod(xt_quota2.ko) multiversion(kernel) xtables-addons-kmp xtables-addons-kmp-64kb xtables-addons-kmp-64kb(aarch-64) xtables-addons-kmp-64kb-k6.3.4_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-64kb kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
