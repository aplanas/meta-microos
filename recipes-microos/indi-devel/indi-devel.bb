SUMMARY = "Development files for libindi"
DESCRIPTION = "This package contains development files for libindi."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & GPL-3.0-or-later"

PV = "1.9.9"

RPM_NAME = "indi-devel-1.9.9-2.2.aarch64.rpm"
RPM_HASH = "cbaf8291f852acb5b10f59c99a0919ed1bb548435cd6b644e4eff82066ee792ba6a30cf42b7d02161827a126028cd21164ba8623624962baf9684972d72f81be"

RPROVIDES:${PN} += "indi-devel indi-devel(aarch-64) pkgconfig(libindi)"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libindiAlignmentDriver1 libindiclient1 libindiclientqt1 libindidriver1 libindilx200-1"

inherit rpm
