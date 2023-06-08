SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "2.2.0"

RPM_NAME = "python39-maxminddb-2.2.0-3.1.aarch64.rpm"
RPM_HASH = "5fa5be721c50c74f592ac71f04a574c750c9c345bcb19b1fe5dade1c30bb54c9df86e57eb43be32f4e20d0150298d0d5d870a33a200ac81ecb00e12f92438673"

RPROVIDES:${PN} += "python3.9dist(maxminddb) python39-maxminddb python39-maxminddb(aarch-64) python3dist(maxminddb)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmaxminddb.so.0()(64bit) python(abi)"

inherit rpm
