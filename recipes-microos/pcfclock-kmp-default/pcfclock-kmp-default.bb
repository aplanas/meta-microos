SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.3.4_1"

RPM_NAME = "pcfclock-kmp-default-0.44_k6.3.4_1-269.26.aarch64.rpm"
RPM_HASH = "42c6e65e39f8c845c2fb976cd25ec6601f81a1599b339695b8b259a8a0b8c1470d819e476dd71cb14f476554178d6411ff3506a7b646540c00bf4e9c08ca9c14"

RPROVIDES:${PN} += "kmod(pcfclock.ko) \
multiversion(kernel) \
pcfclock-kmp \
pcfclock-kmp-default \
pcfclock-kmp-default(aarch-64) \
pcfclock-kmp-default-k6.3.4_1"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
grep \
kernel-uname-r \
suse-kernel-rpm-scriptlets"

inherit rpm
