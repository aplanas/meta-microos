SUMMARY = "Database report plugin for Prelude Manager"
DESCRIPTION = "This plugin allows prelude-manager to write to database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-manager-db-plugin-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "5c9d591f1f41d6e374175022787d8522d95b46895308e9678ee332a677f1a3bd0a2de7025b922dd98f358507d26c79d3bc186f8e14e4222ad547661b07939747"

RPROVIDES:${PN} += "prelude-manager-db-plugin prelude-manager-db-plugin(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libprelude.so.28()(64bit) libpreludedb.so.7()(64bit) prelude-manager"

inherit rpm
