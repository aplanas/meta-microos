SUMMARY = "Test update that includes security fixes"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'security', indicating that one or more security vulnerabilities \
are being fixed."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-security-5.1-1.17.aarch64.rpm"
RPM_HASH = "dc6638c4da02ca0c3187344c52bc0aabf2e8cc67a0dbb2a04f4fd38bc2f987815dd434d74b839505ad79e1a30dc19013d32456f0c5a3959c56f40bd8cd9c0df7"

RPROVIDES:${PN} += "update-test-security update-test-security(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
