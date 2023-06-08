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

RPM_NAME = "python310-py-radix-0.10.0-1.27.aarch64.rpm"
RPM_HASH = "69cdd8c1e47b340f8be102b9355ce123a9532f24704eff18be2874f310b632c3268a7e160b5d13bccb6f707ea313bdecb4a3b3901a277bd486774c850279a160"

RPROVIDES:${PN} += "python3-py-radix python3.10dist(py-radix) python310-py-radix python310-py-radix(aarch-64) python3dist(py-radix)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
