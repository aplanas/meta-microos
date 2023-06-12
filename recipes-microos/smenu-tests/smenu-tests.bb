SUMMARY = "Testing system for smenu"
DESCRIPTION = "This packages contains some scripts and a number of tests to check the \
smenu tool."
LICENSE = "GPL-2.0-only"

PV = "1.2.0"

RPM_NAME = "smenu-tests-1.2.0-1.3.aarch64.rpm"
RPM_HASH = "cf071deaada081ce53df7a511dfeaa41e86103d05374b4503317de6b97dc6135dacd0ad8c530857e74cd9df00c3fc277f29f3ae16108aca8badc6dca34c6e0c8"

RPROVIDES:${PN} += "smenu-tests \
smenu-tests(aarch-64)"
RDEPENDS:${PN} += "smenu"

inherit rpm
