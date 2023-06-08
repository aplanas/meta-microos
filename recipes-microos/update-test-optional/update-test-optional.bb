SUMMARY = "Test update that is not mandatory"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'optional'. The software stack should not select such updates \
for installation by default. This is used, for example, to add \
new packages to a product."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-optional-5.1-1.17.aarch64.rpm"
RPM_HASH = "8ec8cd810927421563d7f29fd4b7550d85ad19e09fcb28f0cd6cffaa74ed7c53b172ea84b504075cd81a861080529a03ffe14f95655866dcfd552b07a4e2f964"

RPROVIDES:${PN} += "update-test-optional update-test-optional(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
