SUMMARY = "Userspace Read-Copy-Update Library"
DESCRIPTION = "liburcu is a LGPLv2.1 userspace RCU (read-copy-update) library. This data \
synchronization library provides read-side access which scales linearly with \
the number of cores. It does so by allowing multiples copies of a given data \
structure to live at the same time, and by monitoring the data structure \
accesses to detect grace periods after which memory reclamation is possible."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT & GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "liburcu-devel-0.14.0-1.3.aarch64.rpm"
RPM_HASH = "82a474307fa57e3641c28cec55d9c7ea07ca20438d822fe3d6781d32d37bd35b6bbee6ff76360232570972ec0960d0493ac6cccf7aec6205b7ee0be606204dbe"

RPROVIDES:${PN} += "liburcu-devel liburcu-devel(aarch-64) pkgconfig(liburcu) pkgconfig(liburcu-bp) pkgconfig(liburcu-cds) pkgconfig(liburcu-mb) pkgconfig(liburcu-memb) pkgconfig(liburcu-qsbr) pkgconfig(liburcu-signal)"
RDEPENDS:${PN} += "/usr/bin/pkg-config liburcu8"

inherit rpm
