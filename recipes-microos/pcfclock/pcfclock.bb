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

RPM_NAME = "pcfclock-0.44-269.26.aarch64.rpm"
RPM_HASH = "03fd91bb5b7bffe2fb618fc1a5b042f7f913071a06163f5d441283a2c641de8489eba17a161ad44fda7f0ae80a6dcd4fb612c5994c7b1e4d11bb952c5f547af9"

RPROVIDES:${PN} += "pcfclock \
pcfclock(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
pcfclock-kmp \
systemd"

inherit rpm
