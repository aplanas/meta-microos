SUMMARY = "Portuguese ispell dictionary"
DESCRIPTION = "This package includes a ready Portuguese dictionary for ispell. A \
short usage description for ispell is given in \
/usr/share/doc/packages/ispell/README of the package ispell. The \
sources for this dictionary are included in the package dicts."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "ispell-portuguese-1.5-422.6.aarch64.rpm"
RPM_HASH = "8211d0cfdd5975e2dc52d5560cb5edde7055625b7a6c14840f29715c32ccd569211513614de36640e2cfa64e57d8732b88f0f1bf5cb2715278a7b175c694660b"

RPROVIDES:${PN} += "iportug ispell-portuguese ispell-portuguese(aarch-64) ispell_dictionary locale(ispell:pt;pt_PT)"
RDEPENDS:${PN} += ""

inherit rpm
