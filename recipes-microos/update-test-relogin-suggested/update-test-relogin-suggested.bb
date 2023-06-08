SUMMARY = "Test update that requires a session restart"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should inform the user that a session \
restart (re-login) is necessary. This is used, for example, in \
window manager updates."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-relogin-suggested-5.1-1.17.aarch64.rpm"
RPM_HASH = "facaf8fe1d4fab6d7aa3004302bbf5840a5e11ed6e93e2af568f705b473ebb723e32b251ca00f1ddd5fe1c39bd0caa41ecf70fa5d57ddacdb99c328be58b974a"

RPROVIDES:${PN} += "update-test-relogin-suggested update-test-relogin-suggested(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
