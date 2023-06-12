SUMMARY = "A full-featured console (xterm et al.) user interface library"
DESCRIPTION = "Urwid is a console user interface library.  It includes many features \
useful for text console application developers including: \
- Applications resize quickly and smoothly \
- Automatic, programmable text alignment and wrapping \
- Simple markup for setting text attributes within blocks of text \
- Powerful list box with programmable content for scrolling all widget types \
- Your choice of event loops: Twisted, Glib or built-in select-based loop \
- Pre-built widgets include edit boxes, buttons, check boxes and radio buttons \
- Display modules include raw, curses, and experimental LCD and web displays \
- Support for UTF-8, simple 8-bit and CJK encodings \
- 256 and 88 color mode support \
- Python 3.2 support"
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.2"

RPM_NAME = "python310-urwid-2.1.2-5.1.aarch64.rpm"
RPM_HASH = "64a335294af403a5071db0f9bdf17981b868d2c878b90d2963bb16ebeb3f66318b8b15e8fc3d7c6c427692455c76d3602b8a6737515e673dc788cfcda7a0b376"

RPROVIDES:${PN} += "python3-urwid \
python3.10dist(urwid) \
python310-urwid \
python310-urwid(aarch-64) \
python3dist(urwid)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-curses"

inherit rpm
