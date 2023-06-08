SUMMARY = "Development files for ocaml-calendar"
DESCRIPTION = "The ocaml-calendar-devel package contains libraries and signature files for \
developing applications that use ocaml-calendar."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "ocaml-calendar-devel-3.0.0-1.4.aarch64.rpm"
RPM_HASH = "e32ff7d53eee8fb89e9d5951bf4295868fd3f1c5c03551960ed285bd95876e0fbae38fc2669e1e8583971bfa4523646b2f1e8ea873e522f6f13e02031e36c38a"

RPROVIDES:${PN} += "ocaml(CalendarLib) ocaml(CalendarLib__Calendar) ocaml(CalendarLib__Calendar_builder) ocaml(CalendarLib__Calendar_sig) ocaml(CalendarLib__Date) ocaml(CalendarLib__Date_sig) ocaml(CalendarLib__Fcalendar) ocaml(CalendarLib__Ftime) ocaml(CalendarLib__Period) ocaml(CalendarLib__Printer) ocaml(CalendarLib__Time) ocaml(CalendarLib__Time_Zone) ocaml(CalendarLib__Time_sig) ocaml(CalendarLib__Utils) ocaml(CalendarLib__Version) ocaml-calendar-devel ocaml-calendar-devel(aarch-64) ocamlfind(calendar) ocamlx(CalendarLib) ocamlx(CalendarLib__Calendar) ocamlx(CalendarLib__Calendar_builder) ocamlx(CalendarLib__Date) ocamlx(CalendarLib__Fcalendar) ocamlx(CalendarLib__Ftime) ocamlx(CalendarLib__Printer) ocamlx(CalendarLib__Time) ocamlx(CalendarLib__Time_Zone) ocamlx(CalendarLib__Utils) ocamlx(CalendarLib__Version)"
RDEPENDS:${PN} += "ocaml(CamlinternalFormatBasics) ocaml(CamlinternalLazy) ocaml(Re) ocaml(Re__) ocaml(Re__Automata) ocaml(Re__Category) ocaml(Re__Core) ocaml(Re__Cset) ocaml(Re__Pmark) ocaml(Re__Str) ocaml(Stdlib) ocaml(Stdlib__Array) ocaml(Stdlib__Bigarray) ocaml(Stdlib__Buffer) ocaml(Stdlib__Complex) ocaml(Stdlib__Either) ocaml(Stdlib__Format) ocaml(Stdlib__Hashtbl) ocaml(Stdlib__Lazy) ocaml(Stdlib__List) ocaml(Stdlib__Map) ocaml(Stdlib__Seq) ocaml(Stdlib__Set) ocaml(Stdlib__String) ocaml(Stdlib__Uchar) ocaml(Unix) ocaml-calendar ocamlfind(re) ocamlfind(unix) ocamlx(CamlinternalLazy) ocamlx(Re__Str) ocamlx(Stdlib) ocamlx(Stdlib__Buffer) ocamlx(Stdlib__Format) ocamlx(Stdlib__Hashtbl) ocamlx(Stdlib__List) ocamlx(Stdlib__String) ocamlx(Unix)"

inherit rpm
