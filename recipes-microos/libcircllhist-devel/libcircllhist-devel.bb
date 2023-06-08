SUMMARY = "Development files for libcircllhist"
DESCRIPTION = "Development files for libcircllhist, an implementation of Circonus log-linear \
histograms written in C."
LICENSE = "BSD-3-Clause"

PV = "20180917"

RPM_NAME = "libcircllhist-devel-20180917-2.17.aarch64.rpm"
RPM_HASH = "4f81b159ee103cfc303b797a0bb06a3c6abe70f50bde480b23463392af06d527b9c334a1f06c55bdbb80cd3edb46bffaee78b8ac1d3c33cfb67a935a6d8be163"

RPROVIDES:${PN} += "libcircllhist-devel libcircllhist-devel(aarch-64)"
RDEPENDS:${PN} += "libcircllhist0_0_1"

inherit rpm
