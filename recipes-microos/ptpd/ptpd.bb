SUMMARY = "Implementation of the Precision Time protocol (IEEE 1588)"
DESCRIPTION = "The PTP daemon (PTPd) implements the Precision Time protocol (PTP) as \
defined by the IEEE 1588 standard. PTP was developed to provide very \
precise time coordination of LAN connected computers. \
 \
PTPd is a complete implementation of the IEEE 1588 specification for a \
standard (non-boundary) clock. PTPd has been tested with and is known \
to work properly with other IEEE 1588 implementations."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "ptpd-2.3.1-9.11.aarch64.rpm"
RPM_HASH = "6073d3cf398b5d2c0b0f4fbd2f354dc7b3f25f65d4dafede4925965985d0f93fa446d598234897dbf8a6aef416e81c2ce280d680b9f7ad2a7b83cf5b3b0c4177"

RPROVIDES:${PN} += "config(ptpd) \
ptpd \
ptpd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit) \
libnetsnmpmibs.so.40()(64bit) \
libpcap.so.1()(64bit) \
systemd"

inherit rpm
