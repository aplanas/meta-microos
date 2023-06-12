SUMMARY = "Implementation of IEEE 802.1ab"
DESCRIPTION = "This package provides the shared library for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.17"

RPM_NAME = "liblldpctl4-1.0.17-1.1.aarch64.rpm"
RPM_HASH = "aa6a72ef33320405dc5e8aee30bc434e1dfec541416a437ff112b9333e9af2d40bd5c3a819cfb1048820ebe4f374699989a1d86d5b9ee9f967d5b4b005607069"

RPROVIDES:${PN} += "liblldpctl.so.4()(64bit) liblldpctl.so.4(LIBLLDPCTL_4.6)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.7)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.8)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.9)(64bit) liblldpctl4 liblldpctl4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libbsd.so.0(LIBBSD_0.2)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
