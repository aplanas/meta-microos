SUMMARY = "Command-line utilties to manipulate IEEE1394 devices"
DESCRIPTION = "Command-line utilities to inspect and send IEEE 1394 isochronous \
packets, and to test the basic functionality of raw1394."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "libraw1394-tools-2.1.2-1.11.aarch64.rpm"
RPM_HASH = "8131aa3f7a0fb74d79f05604738ec01a49830a79e51e2092c9e17412436d269b638fc734254a59b49f9521bb2fd5dbfa5af82aaa2a5d9b30a3b08572ce1d683f"

RPROVIDES:${PN} += "libraw1394 \
libraw1394-tools \
libraw1394-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libraw1394.so.11()(64bit)"

inherit rpm
