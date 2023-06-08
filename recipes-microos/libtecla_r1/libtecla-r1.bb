SUMMARY = "Interactive command line editing library"
DESCRIPTION = "The tecla library provides programs with interactive command line \
editing facilities, similar to those of the tcsh shell. \
In addition to simple command-line editing, it supports recall of \
previously entered command lines, TAB completion of file names or \
other tokens, and in-line wild-card expansion of filenames. The \
internal functions which perform file-name completion and wild-card \
expansion are also available externally for optional use by programs."
LICENSE = "X11"

PV = "1.6.3"

RPM_NAME = "libtecla_r1-1.6.3-3.15.aarch64.rpm"
RPM_HASH = "98ade569fd99a0edd14d5b545f7d70613050798802dddf86ea632f53bfa9f646ab582ea5f4e207b96a396ba6dc6f5f66cdcd1ff3496f4e6125528e8574ea6094"

RPROVIDES:${PN} += "libtecla_r.so.1()(64bit) libtecla_r.so.1(tecla_1.2)(64bit) libtecla_r.so.1(tecla_1.3)(64bit) libtecla_r.so.1(tecla_1.4)(64bit) libtecla_r.so.1(tecla_1.6)(64bit) libtecla_r.so.1(tecla_l.5)(64bit) libtecla_r1 libtecla_r1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
