SUMMARY = "SQLite3 database access from Guile"
DESCRIPTION = "This package provides Guile bindings to the SQLite3 database system."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "guile-sqlite3-0.1.3-1.8.aarch64.rpm"
RPM_HASH = "870cd071bbcfa1780710e8af3988b7f26a2a21e4018b618ed18c9de5a80ab8e1c9cb092f4905bf59bd555cee0cb596ba512d1108d6ec47e8900d9c1ec64914ba"

RPROVIDES:${PN} += "guile-sqlite3 \
guile-sqlite3(aarch-64)"
RDEPENDS:${PN} += "guile \
sqlite3-devel"

inherit rpm
