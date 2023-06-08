SUMMARY = "A key remapping daemon for linux"
DESCRIPTION = "Linux lacks a good key remapping solution. \
In order to achieve satisfactory results a medley of tools need to be employed \
(e.g xcape, xmodmap) with the end result often being tethered to a specified \
environment (X11). \
keyd attempts to solve this problem by providing a flexible system wide daemon \
which remaps keys using kernel level input primitives (evdev, uinput)."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "keyd-2.4.2-2.1.aarch64.rpm"
RPM_HASH = "5c911892619f23db5b061f61c5521af9b05f33bb2f25ba04c67f2645fb2a6b6b024bf628e6199e247b12af37f7cfde8153923136574e647b8b98098cba9f1aa9"

RPROVIDES:${PN} += "keyd keyd(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3 libc.so.6(GLIBC_2.34)(64bit) python3-xlib sed shadow"

inherit rpm
