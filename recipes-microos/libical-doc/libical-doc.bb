SUMMARY = "Example source code for programs to use libical"
DESCRIPTION = "Libical is an implementation of the IETF's iCalendar \
calendaring and scheduling protocols (RFC 2445, 2446, and 2447). It \
parses iCal components and provides a C API for manipulating the \
component properties, parameters, and subcomponents."
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.16"

RPM_NAME = "libical-doc-3.0.16-1.4.noarch.rpm"
RPM_HASH = "00f21fd2972257518260cfdd987f293d7806220b8d69988c8505b66dd700b8f4235a2c3e13fe59872c15e43720e471d1b1010d5f37134aef263b4e1bc99e4940"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libical-doc"
RDEPENDS:${PN} += ""

inherit rpm
