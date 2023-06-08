SUMMARY = "A CLI tool for sr.ht"
DESCRIPTION = "hut is a CLI companion utility to interact with sr.ht."
LICENSE = "AGPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "hut-0.3.0-1.1.aarch64.rpm"
RPM_HASH = "69d612b873d39fcdf52ad65602471d00d3cfa6c056e4bdadfcc7c0ea7b8c21075179a5241a478082be9c569e6f737fad7a54f1c180299b5588a7e56a5ef6e268"

RPROVIDES:${PN} += "hut hut(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
