SUMMARY = "Userspace logging for Netfilter"
DESCRIPTION = "ulogd is a userspace logging daemon for netfilter/iptables related \
logging. This includes per-packet logging of security violations, \
per-packet logging for accounting purpose as well as per-flow \
logging."
LICENSE = "GPL-2.0-only"

PV = "2.0.7"

RPM_NAME = "ulogd-2.0.7-6.8.aarch64.rpm"
RPM_HASH = "c51c984412b8f88949c453584aa8c1a3d96c9059a776ce8e3a2e16e0eb5947aeaaefdde183b7b6a096324f9c6ad7cbfc8f6685716b1f843a76f20d7b384ad8f3"

RPROVIDES:${PN} += "config(ulogd) \
group(ulogd) \
ulogd \
ulogd(aarch-64) \
user(ulogd)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit) \
libnetfilter_acct.so.1()(64bit) \
libnetfilter_acct.so.1(LIBNETFILTER_ACCT_1.0)(64bit) \
libnetfilter_acct.so.1(LIBNETFILTER_ACCT_1.1)(64bit) \
libnetfilter_conntrack.so.3()(64bit) \
libnetfilter_log.so.1()(64bit) \
libnfnetlink.so.0()(64bit) \
libnfnetlink.so.0(NFNETLINK_1.0.1)(64bit) \
sysuser-shadow"

inherit rpm
