SUMMARY = "Multilingual file viewer with user interface like 'less'"
DESCRIPTION = "Lv is a multilingual file viewer and looks like the 'less' utility. \
It can decode and encode multilingual streams through many coding \
systems, and can be used as a coding system translation filter. Lv \
can recognize multibyte patterns as regular expressions, and provides \
multilingual grep functionality under the name lgrep. It also \
recognizes ANSI escape sequences for text decoration."
LICENSE = "GPL-2.0+"

PV = "4.51"

RPM_NAME = "lv-4.51-149.23.aarch64.rpm"
RPM_HASH = "cdb6c1ff65b05be50287ab892454a6e706ec0d1a45d8842aee10c6ff79d21fa0a2369fe75866721fea0073ef9951863d69609ad046c02fa5e625a9a9ff2777c1"

RPROVIDES:${PN} += "locale(ja;ko;zh) lv lv(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
