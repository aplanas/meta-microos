SUMMARY = "Python3 bindings for the notcurses library"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains the python3 bindings for the notcurses \
library."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "python3-notcurses-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "d9b668e2c812f03c3e3fd0c82d114a8dfb354a0525786f465711105451a81b0cf425975dd7fe10e739e1476a94ac656f724923af288d09c177087fcce1585f4d"

RPROVIDES:${PN} += "python3-notcurses python3-notcurses(aarch-64) python3.10dist(notcurses) python3dist(notcurses)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnotcurses.so.3()(64bit) python(abi)"

inherit rpm
