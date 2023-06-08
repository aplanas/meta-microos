SUMMARY = "Implementation of IEEE 802.1ab"
DESCRIPTION = "This package provides the shared library for lldpd. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices."
LICENSE = "MIT"

PV = "1.0.16"

RPM_NAME = "liblldpctl4-1.0.16-1.4.aarch64.rpm"
RPM_HASH = "9a5522e85d1fad99b16417c3b711658f58baa98513c87b6b399737538d9de81f961c244319435d6d76bb84010e2def0d768c2283839b423556de10b3a2214550"

RPROVIDES:${PN} += "liblldpctl.so.4()(64bit) liblldpctl.so.4(LIBLLDPCTL_4.6)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.7)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.8)(64bit) liblldpctl.so.4(LIBLLDPCTL_4.9)(64bit) liblldpctl4 liblldpctl4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbsd.so.0()(64bit) libbsd.so.0(LIBBSD_0.0)(64bit) libbsd.so.0(LIBBSD_0.2)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
