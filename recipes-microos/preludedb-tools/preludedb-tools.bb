SUMMARY = "Tools of libpreludedb"
DESCRIPTION = "The PreludeDB Library provides an abstraction layer upon the type \
and the format of the database used to store IDMEF alerts. It \
allows developers to use the Prelude IDMEF database easily and \
efficiently without worrying about SQL, and to access the \
database independently of the type/format of the database."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-only & GPL-3.0-or-later"

PV = "5.2.0"

RPM_NAME = "preludedb-tools-5.2.0-2.10.aarch64.rpm"
RPM_HASH = "5bd6ba8c6291434f26386b711021e3b3c174b6d8db9f0c5ea1cdc091f35ef98abf01a0ea6b4f470754a111ca2ef4ec0fed079bb2573666b8b81c1be7987dc5a0"

RPROVIDES:${PN} += "preludedb-tools preludedb-tools(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
