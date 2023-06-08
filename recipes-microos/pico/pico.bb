SUMMARY = "A small, easy to use editor"
DESCRIPTION = "Pico is a simple, display-oriented text editor based on the Pine \
message system composer. As with Pine, commands are displayed at the \
bottom of the screen, and context-sensitive help is provided. \
Characters are inserted into the text as they are typed."
LICENSE = "Apache-2.0"

PV = "5.09"

RPM_NAME = "pico-5.09-27.4.aarch64.rpm"
RPM_HASH = "5afa5248de87a43babe6f24176b3cd7f86dff3381bc4a9f7bf59983fa465466ebf8a81d8f010d1a58a0c21d4075217dea9fbd8ffbbd3e00cc10a1a548fedcf7f"

RPROVIDES:${PN} += "pico pico(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
