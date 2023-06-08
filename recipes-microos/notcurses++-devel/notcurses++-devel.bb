SUMMARY = "Development files for notcurses++"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libnotcurses."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "notcurses++-devel-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "ba072630692e7e47d17fe973ea96ba9351b172af345fa02fbda226cf787783f9b4aaa98145af205e21c0cc052e03fea2d8dcd58cbafc8dc44d52ee7e20b87b3c"

RPROVIDES:${PN} += "cmake(Notcurses++) notcurses++-devel notcurses++-devel(aarch-64) pkgconfig(notcurses++)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libnotcurses++3 pkgconfig(notcurses)"

inherit rpm
