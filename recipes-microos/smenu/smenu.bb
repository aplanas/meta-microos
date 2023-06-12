SUMMARY = "A standard input word picker"
DESCRIPTION = "This tool reads words from a file or standard input, presents them in an \
interactive window after the current line on the terminal, and writes the \
selected words, if any, to standard output."
LICENSE = "GPL-2.0-only"

PV = "1.2.0"

RPM_NAME = "smenu-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "b7aa79ba67af8ca01f4d63d33d0005ec8cd3b7cba043cbeb9b05175d5b8df64db9507a2237c33d6ae7707e6ab92a57bb66b101dd29a31fd0a879c323f117d900"

RPROVIDES:${PN} += "smenu \
smenu(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
