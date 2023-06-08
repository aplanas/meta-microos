SUMMARY = "Radix tree implementation"
DESCRIPTION = "Implements the radix tree data structure for the storage and \
retrieval of IPv4 and IPv6 network prefixes. \
 \
The radix tree is commonly used for routing table lookups. It efficiently \
stores network prefixes of varying lengths and allows fast lookups of \
containing networks. \
 \
This package includes the C-extension."
LICENSE = "ISC & BSD-4-Clause"

PV = "0.10.0"

RPM_NAME = "python311-py-radix-0.10.0-1.27.aarch64.rpm"
RPM_HASH = "9627bf89cf1b0dec7afbab263a8cfd191f958538f6d426d062674dd1c6941c744f825ba2b3919485ffab0b741ff18d5e1158b16848e674aa7046bf42ce6f7561"

RPROVIDES:${PN} += "python3.11dist(py-radix) python311-py-radix python311-py-radix(aarch-64) python3dist(py-radix)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
