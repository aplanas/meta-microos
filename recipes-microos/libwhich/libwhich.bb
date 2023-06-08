SUMMARY = "Which for Dynamic Libraries"
DESCRIPTION = "A command line utility to locate shared libraries by name."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "libwhich-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "b857481c00cdc6fcd770382ceca0593c088871aa887f82e12c2ed318e377fee476c7cf1ace4ea2e0bec9aab10bdff5c8b1c1c8128d2ffe810a8d494ea1cb24ef"

RPROVIDES:${PN} += "libwhich libwhich(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
