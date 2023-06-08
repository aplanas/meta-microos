SUMMARY = "Development files for libical, an implementation of basic iCAL protocols"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
Calendaring and Scheduling protocols. (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-devel-3.0.16-1.4.aarch64.rpm"
RPM_HASH = "c637cd54271cb69c07787afb909628e5d00c0cd239e2f1f400fc23d5acf51658f2de50e474c94bd614ad39ae7f867644db4540bf176bc5755cb512591c16b0c8"

RPROVIDES:${PN} += "cmake(LibIcal) libical-devel libical-devel(aarch-64) pkgconfig(libical)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libical3 pkgconfig(icu-i18n)"

inherit rpm
