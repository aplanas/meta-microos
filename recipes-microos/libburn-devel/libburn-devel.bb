SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.4"

RPM_NAME = "libburn-devel-1.5.4-1.10.aarch64.rpm"
RPM_HASH = "9f0d679d3706d41478b665cbecb146a48d794e4402001067340c0819ba74441ff794f8c72b5a3107d66814428e426d0f36e57df9f7d8a60fbc2f43abd42909a3"

RPROVIDES:${PN} += "libburn-devel libburn-devel(aarch-64) pkgconfig(libburn-1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libburn4"

inherit rpm
