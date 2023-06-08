SUMMARY = "A hex dump utility"
DESCRIPTION = "xxd creates a hex dump of a given file or standard input.  It can also convert \
a hex dump back to its original binary form."
LICENSE = "Vim"

PV = "9.0.1504"

RPM_NAME = "xxd-9.0.1504-1.1.aarch64.rpm"
RPM_HASH = "68406bddb2a700a3b85b27a60f6ab24b7eeb3026f81d947bb06d67bd1df98b56776f72081cf38506d59991db9f6cfc9cd3693f118310e454ae4f0fbcf9eabeb7"

RPROVIDES:${PN} += "xxd xxd(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
