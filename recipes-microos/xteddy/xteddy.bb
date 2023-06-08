SUMMARY = "A cuddly teddy bear for your X Window desktop"
DESCRIPTION = "Normally, xteddy just sits around doing nothing. After all, that's what \
teddy bears are for. Look at him, talk to him, place heavy windows on \
top of him, zap him around until he becomes dizzy, do what you like; he \
will always be your true (albeit virtual) friend. \
 \
You can move xteddy with the mouse by pointing at him and dragging him \
around. When clicked upon, he will pop up on top of all other windows. \
If you type 'q' on him, he will die (or, as I like to think of it, be \
tucked away in the file system until you need him next time). \
 \
That's it. But he's cute. \
 \
 \
 \
Authors: \
-------- \
    Stefan Gustavson <stefang@isy.liu.se>"
LICENSE = "GPL-2.0+"

PV = "2.2"

RPM_NAME = "xteddy-2.2-27.20.aarch64.rpm"
RPM_HASH = "e197fc8ce5707119a0ec55aa06b8e9bc1a57c05b0edbc18ea22190d2e04cdd78d68fabd16d8c28621846c4e1b4fdc7b0e88a219ecdc595cb462e628167c9ada8"

RPROVIDES:${PN} += "xteddy xteddy(aarch-64) xteddy10"
RDEPENDS:${PN} += "/bin/bash /bin/sh imlib2-loaders ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImlib2.so.1()(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
