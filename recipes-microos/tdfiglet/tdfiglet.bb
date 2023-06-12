SUMMARY = "Shell Art"
DESCRIPTION = "Because figlet ASCII is not as cool."
LICENSE = "BSD-3-Clause"

PV = "0.5+3"

RPM_NAME = "tdfiglet-0.5+3-1.6.aarch64.rpm"
RPM_HASH = "ade83a46d978df3332cf2e57a8d3c64ee37baa5cd1c66c98c2b90c962bb7650d8f1d16268d5e3f9e0e2763544e0cf3618e4a5638f15e01d409178793501f9727"

RPROVIDES:${PN} += "tdfiglet \
tdfiglet(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
