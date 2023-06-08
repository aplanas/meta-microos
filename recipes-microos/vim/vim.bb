SUMMARY = "Vi IMproved"
DESCRIPTION = "Vim (Vi IMproved) is an almost compatible version of the UNIX editor \
vi. Almost every possible command can be performed using only ASCII \
characters. Only the 'Q' command is missing (you do not need it). Many \
new features have been added: multilevel undo, command line history, \
file name completion, block operations, and editing of binary data."
LICENSE = "Vim"

PV = "9.0.1504"

RPM_NAME = "vim-9.0.1504-1.1.aarch64.rpm"
RPM_HASH = "6beaba66f2812964d95141e04e4df5699a6ea439131d46f3297c2a2249d847a4ed84e9b91875cb45575d432c34e46d560d11fdb15ab90dc5e7c1887182a4bc1b"

RPROVIDES:${PN} += "vi vim vim(aarch-64) vim-base vim-enhanced vim-python vim_client"
RDEPENDS:${PN} += "/bin/sh alts ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libacl.so.1()(64bit) libacl.so.1(ACL_1.0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libperl.so()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) perl vim-data-common xxd"

inherit rpm
