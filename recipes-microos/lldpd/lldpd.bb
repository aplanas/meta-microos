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

PV = "1.0.16"

RPM_NAME = "lldpd-1.0.16-1.4.aarch64.rpm"
RPM_HASH = "ea13179f1312ed4dd0cfa2d5947cdc5a482e29ddd126eab0d729eb21f69caef547e0ccec2848267b3bc3e9633ec2b031eac8dd9981716c7aa940a189e7a08b17"

RPROVIDES:${PN} += "config(lldpd) lldpd lldpd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/mkdir /usr/bin/touch fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libbsd.so.0(LIBBSD_0.2)(64bit) libbsd.so.0(LIBBSD_0.5)(64bit) libbsd.so.0(LIBBSD_0.6)(64bit) libc.so.6(GLIBC_2.34)(64bit) libevent-2.1.so.7()(64bit) liblldpctl.so.4()(64bit) liblldpctl.so.4(LIBLLDPCTL_4.6)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.7)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.8)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.9)(64bit) libnetsnmp.so.40()(64bit) libnetsnmpagent.so.40()(64bit) libnetsnmpmibs.so.40()(64bit) libreadline.so.8()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libxml2.so.2(LIBXML2_2.6.5)(64bit) pwdutils"

inherit rpm
