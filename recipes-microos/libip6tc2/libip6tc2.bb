SUMMARY = "Library for the ip_tables low-level ruleset generation and parsing (IPv6)"
DESCRIPTION = "libiptc ('iptables cache') is used to retrieve from the kernel, parse, \
construct, and load rulesets into the kernel. \
This package contains the iptc IPv6 API."
LICENSE = "Artistic-2.0 & GPL-2.0-only"

PV = "1.8.9"

RPM_NAME = "libip6tc2-1.8.9-1.3.aarch64.rpm"
RPM_HASH = "f69614de21f6f95494ab0810b17bfd0e9ac7d91ae07bf737fb09e6f05ec9dbfc477ba6b1d3a251fc8a2d001136618e664c104774e8ba6e44aa91de62354d54cd"

RPROVIDES:${PN} += "libip6tc.so.2()(64bit) \
libip6tc2 \
libip6tc2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit)"

inherit rpm
