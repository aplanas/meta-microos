SUMMARY = "MATE Desktop keyboard configuration common files"
DESCRIPTION = "This package provides libmatekdb, an API to manage the keyboard in \
MATE Desktop applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.26.0"

RPM_NAME = "matekbd-common-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "ba64b7293060cb1d0074be5191c981338ee1c0423f94a974e4754e331d12c6b1ee82b5d606c388da5ba50918de22b0b88ad6786ddfcfa21a2b1302a001b2a9e1"

RPROVIDES:${PN} += "matekbd-common matekbd-common(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
