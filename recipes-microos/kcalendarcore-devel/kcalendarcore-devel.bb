SUMMARY = "Development files for kcalendarcore, a library to handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package contains the headers necessary to \
develop applications making use of KCalendarCore."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kcalendarcore-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "0d7f6a8166b757384f1c5df9b31672b6fc3a4e127a9ea30130d21787aa6e1a4fce3f406d0964c0b4cbc896ed0a7b8d13e71194b29531e317b4156188cd5b2851"

RPROVIDES:${PN} += "cmake(KF5CalendarCore) kcalcore-devel kcalcore5-devel kcalendarcore-devel kcalendarcore-devel(aarch-64) pkgconfig(KF5CalendarCore)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(LibIcal) libKF5CalendarCore5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui)"

inherit rpm
