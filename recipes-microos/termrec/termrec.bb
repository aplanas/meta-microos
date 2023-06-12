SUMMARY = "Records Videos of Terminal Output"
DESCRIPTION = "Termrec is a program for recording 'videos' of terminal output. \
 \
Utilities provided are \
- termplay the player. \
- termrec the console recorder. Allows you to capture the output \
of a console program. \
- proxyrec a telnet proxy. Will capture the session to a file. \
- termtime takes one of more ttyrecs. Measures their lengths. \
Prints that. \
- termcat copies a ttyrec, possibly converting it to a different \
format and/or combining several ttyrecs together."
LICENSE = "LGPL-2.0-or-later"

PV = "0.19"

RPM_NAME = "termrec-0.19-1.13.aarch64.rpm"
RPM_HASH = "0f6f137b3fdda90b291fc7ead38f6518f2feae4562b84d93bdcffcc3570b9e1bb8c2b39c08af2982648a6c8aa9f27c5e707e6c256ad8768f6eb3f227994982b7"

RPROVIDES:${PN} += "termrec \
termrec(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libtty.so.1()(64bit) \
libtty1"

inherit rpm
