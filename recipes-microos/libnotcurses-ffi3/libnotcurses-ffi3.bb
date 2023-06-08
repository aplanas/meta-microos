SUMMARY = "Character graphics and TUI library (FFI version)"
DESCRIPTION = "notcurses facilitates the creation of modern TUI programs, making \
full use of Unicode and 24-bit TrueColor. Its API is similar \
to that of NCURSES, but extends that with z-buffering, rendering \
of images and video using ffmpeg, alpha blending, widgets, palette \
fades, resize awareness, and multithreading support. \
 \
This subpackage contains shared library part of libnotcurses (FFI \
version)."
LICENSE = "Apache-2.0"

PV = "3.0.9"

RPM_NAME = "libnotcurses-ffi3-3.0.9-1.5.aarch64.rpm"
RPM_HASH = "79a528d7169e60aac35e912b343a9c29aa337a1493ff610a28a510bd369a1e7cb1b18ffb00ae3e065fa54ba3cc0b2976e3ed461a43786af46349d96b40208715"

RPROVIDES:${PN} += "libnotcurses-ffi.so.3()(64bit) libnotcurses-ffi3 libnotcurses-ffi3(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libnotcurses-core.so.3()(64bit)"

inherit rpm
