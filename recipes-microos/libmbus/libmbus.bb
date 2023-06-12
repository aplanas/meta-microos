SUMMARY = "M-bus Library"
DESCRIPTION = "libmbus is an open source library for the M-bus (Meter-Bus) protocol. \
 \
The Meter-Bus is a standard for reading out meter data from electricity meters, heat meters, gas meters, etc. The M-bus standard deals with both the electrical signals on the M-Bus, and the protocol and data format used in transmissions on the M-Bus. The role of libmbus is to decode/encode M-bus data, and to handle the communication with M-Bus devices."
LICENSE = "BSD-3-Clause"

PV = "0.9.0+59"

RPM_NAME = "libmbus-0.9.0+59-1.3.aarch64.rpm"
RPM_HASH = "c92eaaf5d77f20271456ca75c179e21c579dc69c963e683a61ec43934924efaecbc9c68f770fbef10eed95d9e62f643e7f2854cbee79e262cc3d15d118e59884"

RPROVIDES:${PN} += "libmbus \
libmbus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libmbus.so.0()(64bit)"

inherit rpm
