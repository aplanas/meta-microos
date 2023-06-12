SUMMARY = "An utility to look up an IP address in a MaxMind DB file"
DESCRIPTION = "The libmaxminddb library provides a C library for reading MaxMind DB \
files, including the GeoIP2 databases from MaxMind. This is a \
custom binary format designed to facilitate fast lookups of IP \
addresses while allowing for great flexibility in the type of \
data associated with an address. \
 \
This package contains the mmdblookup binary."
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "mmdblookup-1.7.1-1.2.aarch64.rpm"
RPM_HASH = "00578fe884f09f24bbaa73d1b82ef8ee30ce544365c11ba5a379ed0dbd474bf4d7d322c61f5053edede8bbac4c7c54d8eb78f985b6fa012b97c5d218f18f3c2b"

RPROVIDES:${PN} += "mmdblookup \
mmdblookup(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmaxminddb.so.0()(64bit)"

inherit rpm
