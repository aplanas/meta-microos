SUMMARY = "Development files for kcalendarcore, a library to handle calendar data"
DESCRIPTION = "KCalendarCore is a library to provide access to and handling of calendar data. \
It supports the standard formats iCalendar and vCalendar and the group \
scheduling standard iTIP. This package contains the headers necessary to \
develop applications making use of KCalendarCore."
LICENSE = "LGPL-2.0-or-later"

PV = "5.105.0"

RPM_NAME = "kcalendarcore-devel-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "d16571fd6a0db8aca9fb7ee6ea62dc12b0dfa7f73fa583827d3dba1a724bc5de837f9412884e00548f43b0737dcd9d1595125ab1e3e3c8c94760cbf00963761c"

RPROVIDES:${PN} += "cmake(KF5CalendarCore) kcalcore-devel kcalcore5-devel kcalendarcore-devel kcalendarcore-devel(aarch-64) pkgconfig(KF5CalendarCore)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(LibIcal) libKF5CalendarCore5 pkgconfig(Qt5Core) pkgconfig(Qt5Gui)"

inherit rpm
