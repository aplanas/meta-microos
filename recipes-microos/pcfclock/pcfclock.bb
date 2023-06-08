SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44"

RPM_NAME = "pcfclock-0.44-269.23.aarch64.rpm"
RPM_HASH = "109dc9bdff538f505005535c4ccbab1aed7165641ed8364702112b96138eb6274c31d5705bfe9948866cd6c888445b11d2b1b32983a80bb307c11429d4275465"

RPROVIDES:${PN} += "pcfclock pcfclock(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) pcfclock-kmp systemd"

inherit rpm
