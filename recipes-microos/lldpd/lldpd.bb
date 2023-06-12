SUMMARY = "Implementation of IEEE 802.1ab (LLDP)"
DESCRIPTION = "This implementation provides LLDP sending and reception, supports VLAN \
and includes an SNMP subagent that can interface to an SNMP agent \
through AgentX protocol. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices. \
 \
This daemon is also able to deal with CDP, FDP, SONMP and EDP \
protocol. It also handles LLDP-MED extension."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "1.0.17"

RPM_NAME = "lldpd-1.0.17-1.1.aarch64.rpm"
RPM_HASH = "15662c372bef9b17720f34581064235ebaf46a88b7da119941e881db92e3261073aa512b7ddf2554df22d7dcac194d8107eb69ca200ca28b6ca8148ca9495372"

RPROVIDES:${PN} += "config(lldpd) lldpd lldpd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libbsd.so.0(LIBBSD_0.2)(64bit) libbsd.so.0(LIBBSD_0.5)(64bit) libbsd.so.0(LIBBSD_0.6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libevent-2.1.so.7()(64bit) liblldpctl.so.4()(64bit) liblldpctl.so.4(LIBLLDPCTL_4.6)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.7)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.8)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.9)(64bit) libnetsnmp.so.40()(64bit) libnetsnmpagent.so.40()(64bit) libnetsnmpmibs.so.40()(64bit) libreadline.so.8()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) pwdutils"

inherit rpm
