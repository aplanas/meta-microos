SUMMARY = "Maintain symbolic links determining default commands"
DESCRIPTION = "update-alternatives creates, removes, maintains and displays \
information about the symbolic links comprising the alternatives \
system. It is possible for several programs fulfilling the same or \
similar functions to be installed on a single system at the same time. \
For example, many systems have several text editors installed at once. \
This gives choice to the users of a system, allowing each to use a \
different editor, if desired, but makes it difficult for a program to \
make a good choice of editor to invoke if the user has not specified a \
particular preference."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "update-alternatives-1.21.8-1.9.aarch64.rpm"
RPM_HASH = "feb3faaf0e1c0eb7d8fc827778c4a981260485742ba8007bc4293e08e30d27fb9281b888bba3a12a3c62bfeacf9245e25e9dc01e4d97b503fa9387e6e63bf182"

RPROVIDES:${PN} += "alternatives update-alternatives update-alternatives(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
