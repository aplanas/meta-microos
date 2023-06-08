SUMMARY = "IP Packet Filter Administration Extensions"
DESCRIPTION = "Xtables is used to set up, maintain, and inspect the tables of IP \
packet filter rules in the Linux kernel. \
 \
Xtables-addons is the successor to patch-o-matic(-ng). Likewise, it \
contains extensions that were not, or are not yet, accepted in the \
main kernel/iptables packages."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "3.23_k6.3.1_1"

RPM_NAME = "xtables-addons-kmp-default-3.23_k6.3.1_1-1.18.aarch64.rpm"
RPM_HASH = "a40d5bbaa82df49736c8586f37b13b2f7f3fed9f35487712ac6a6ee26d1e4e907fdecc675baca58a58c9bff43f2655766fd17bb263fe2450dba44b45420709bf"

RPROVIDES:${PN} += "kmod(compat_xtables.ko) kmod(xt_ACCOUNT.ko) kmod(xt_CHAOS.ko) kmod(xt_DELUDE.ko) kmod(xt_DHCPMAC.ko) kmod(xt_DNETMAP.ko) kmod(xt_ECHO.ko) kmod(xt_IPMARK.ko) kmod(xt_LOGMARK.ko) kmod(xt_PROTO.ko) kmod(xt_SYSRQ.ko) kmod(xt_TARPIT.ko) kmod(xt_asn.ko) kmod(xt_condition.ko) kmod(xt_fuzzy.ko) kmod(xt_geoip.ko) kmod(xt_iface.ko) kmod(xt_ipp2p.ko) kmod(xt_ipv4options.ko) kmod(xt_length2.ko) kmod(xt_lscan.ko) kmod(xt_pknock.ko) kmod(xt_psd.ko) kmod(xt_quota2.ko) multiversion(kernel) xtables-addons-kmp xtables-addons-kmp-default xtables-addons-kmp-default(aarch-64) xtables-addons-kmp-default-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-default kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
