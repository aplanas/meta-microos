SUMMARY = "Vim with reduced features"
DESCRIPTION = "Vim compiled with reduced feature set such as no script \
interpreters built in"
LICENSE = "Vim"

PV = "9.0.1504"

RPM_NAME = "vim-small-9.0.1504-1.1.aarch64.rpm"
RPM_HASH = "9a1b47800feee328a77268f14380dec30143f9521cd880b34a6236773824ffecb514f65472decd971c10acabe3c736b47c9c582a75f76423c7dd9f7b1ddc074d"

RPROVIDES:${PN} += "vi vim-small vim-small(aarch-64) vim_client"
RDEPENDS:${PN} += "/bin/sh alts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) vim-data-common"

inherit rpm
