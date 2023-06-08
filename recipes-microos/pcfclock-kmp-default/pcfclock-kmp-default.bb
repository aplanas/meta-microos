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

RPM_NAME = "pcfclock-kmp-default-0.44_k6.3.1_1-269.23.aarch64.rpm"
RPM_HASH = "1075b6a365b50d5d59aa46964ab7ec2856117020d55b193730de9a2b4f5a48b361f494c214dad235a1ebf03e0e758f00ef36d4983f6f44f40d2719d8e15d908c"

RPROVIDES:${PN} += "kmod(pcfclock.ko) multiversion(kernel) pcfclock-kmp pcfclock-kmp-default pcfclock-kmp-default(aarch-64) pcfclock-kmp-default-k6.3.1_1"
RDEPENDS:${PN} += "/bin/sh coreutils grep kernel-uname-r suse-kernel-rpm-scriptlets"

inherit rpm
