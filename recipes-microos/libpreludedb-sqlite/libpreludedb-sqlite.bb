SUMMARY = "Plugin to use prelude with a sqlite database"
DESCRIPTION = "This plugin allows prelude to store alerts into a sqlite database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludedb-sqlite-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "85f656078a2fa42afd9bc5e68f251b1c42efead03e1d95859c693114cfc29e059cd82f8ff106f2fd326204839e8178b1f3f10977a1b849c008567b8bc07600a6"

RPROVIDES:${PN} += "libpreludedb-sqlite libpreludedb-sqlite(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libprelude.so.28()(64bit) libpreludedb-plugins libpreludedb.so.7()(64bit) libsqlite3.so.0()(64bit) sqlite"

inherit rpm
