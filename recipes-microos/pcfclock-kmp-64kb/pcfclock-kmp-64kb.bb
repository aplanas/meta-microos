SUMMARY = "Pcfclock kernel driver"
DESCRIPTION = "The pcfclock(4) driver for GNU/Linux supports the parallel port radio \
clock sold by Conrad Electronic under order number 967602. The radio \
clock, which is put between your parallel port and your printer, \
receives the legal German time, i.e. CET or CEST, from the DCF77 \
transmitter and uses it to set its internal quartz clock. The DCF77 \
transmitter is located near to Frankfurt/Main and covers a radius of \
more than 1500 kilometers."
LICENSE = "GPL-2.0-or-later"

PV = "0.44_k6.3.1_1"

RPM_NAME = "pcfclock-kmp-64kb-0.44_k6.3.1_1-269.23.aarch64.rpm"
RPM_HASH = "86775325514494999afd7ec33463e1e79302385ba9a33de9af9d913dad07f3fc24e6fa3a16be9c9ec46724f422db8913ccb673864307c76d0ae7a0de9aaf82fb"

RPROVIDES:${PN} += "kmod(pcfclock.ko) multiversion(kernel) pcfclock-kmp pcfclock-kmp-64kb pcfclock-kmp-64kb(aarch-64) pcfclock-kmp-64kb-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
