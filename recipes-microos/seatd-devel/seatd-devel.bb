SUMMARY = "Development files for seatd"
DESCRIPTION = "Development files for seatd."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "seatd-devel-0.6.4-1.7.aarch64.rpm"
RPM_HASH = "7e2d19301baa1a80edcbccde4cd805b47c9704005c0685f88014b5a3c178891008cf347b80d83cfa548e1d4d2fcb55c4873602a4b3b86b50c15716ffc78482d4"

RPROVIDES:${PN} += "pkgconfig(libseat) seatd-devel seatd-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libseat1 pkgconfig(libsystemd)"

inherit rpm
