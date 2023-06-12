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

RPM_NAME = "python311-urwid-2.1.2-5.1.aarch64.rpm"
RPM_HASH = "ff8c5346186ef2fcb87e9cda5958207c6a16522f0bc463153a1f3b09face8d1f397b763cf7aed87e3dbd730ed1c154e8d9a670c710599921f8683e611863fd43"

RPROVIDES:${PN} += "python3.11dist(urwid) \
python311-urwid \
python311-urwid(aarch-64) \
python3dist(urwid)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-curses"

inherit rpm
