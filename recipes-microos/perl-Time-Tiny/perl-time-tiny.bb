SUMMARY = "Time Object, with As Little Code As Possible"
DESCRIPTION = "*Time::Tiny* is a member of the DateTime::Tiny suite of time modules. \
 \
It implements an extremely lightweight object that represents a time, \
without any time data."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.08"

RPM_NAME = "perl-Time-Tiny-1.08-1.17.noarch.rpm"
RPM_HASH = "963bfb50137e5396df0a1a0cfa36c1edb59985e97527cba218f749201da0b40951af088e9f06b4c41b7b30dd2c3d70c7705f7ffc6995090ef9c719bcdba10d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Time::Tiny) perl-Time-Tiny"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
