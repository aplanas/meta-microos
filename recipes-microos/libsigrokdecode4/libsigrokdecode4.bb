SUMMARY = "Protocol Decoder Library for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libsigrokdecode is a shared library written in C which provides the basic \
API for running sigrok protocol decoders. The protocol decoders themselves \
are written in Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "libsigrokdecode4-0.5.3-2.4.aarch64.rpm"
RPM_HASH = "5536f774bfd3e3f02d950c39a9818b5f94c3bfd0d2b70443f19b32b6e34525a6aaf6b74e483adc6bb37dd627778438edc03abf4cdca0bad46649cf4ec9d04f53"

RPROVIDES:${PN} += "libsigrokdecode.so.4()(64bit) \
libsigrokdecode4 \
libsigrokdecode4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libglib-2.0.so.0()(64bit) \
libpython3.10.so.1.0()(64bit) \
python3-base"

inherit rpm
