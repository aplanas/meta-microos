SUMMARY = "5250 Emulator"
DESCRIPTION = "The 5250 is most commonly used for connecting to IBM's AS/400.	While \
one can connect to an AS/400 with a VT100 emulator, it is not ideal. \
The problem is that the 5250 is a screen at a time terminal, whereas \
the VT100 is a character at a time device.  The emulator uses telnet's \
binary mode to transfer the 5250 data stream."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.5"

RPM_NAME = "tn5250-0.16.5-469.6.aarch64.rpm"
RPM_HASH = "f3dfb5956a89cd3355e86769c585e28066de70e53c9e0bc759384f2cbb5c59d287329870e087dd56efeec5ec7d66339a94813dab734733115cdeac1982ab4268"

RPROVIDES:${PN} += "tn5250 tn5250(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) lib5250.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
