SUMMARY = "OCaml bindings for ncurses"
DESCRIPTION = "OCaml bindings for ncurses."
LICENSE = "LGPL-2.1+"

PV = "1.0.11"

RPM_NAME = "ocaml-curses-1.0.11-1.3.aarch64.rpm"
RPM_HASH = "349aa4527e252fd9512ce47085de22f1428018e9dd7216471a911c54961521aa5f61642e048818e3720e935bf49ba91a7454efc4807563102dd1113916144874"

RPROVIDES:${PN} += "ocaml-curses ocaml-curses(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
