SUMMARY = "Test update which should not be installable"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should fail."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-broken-5.1-1.17.aarch64.rpm"
RPM_HASH = "aecaf195136a15186425b9ef0bbf18357e7521c1147df22df8e9ee3aa6905591c0f7bee579d2f28a8c712201250bd4fcbf30d8d5aa32a54655081af8c5880abd"

RPROVIDES:${PN} += "update-test-broken \
update-test-broken(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
