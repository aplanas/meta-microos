SUMMARY = "Test update that requires a system reboot"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should inform the user that a system \
reboot is necessary. This is used, for example, in kernel updates."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-reboot-needed-5.1-1.17.aarch64.rpm"
RPM_HASH = "be04223121ea2140e5249ccb0c08886bdfe1fd9b6929cb07b345d6d6bdf975d658d667aa994245c4b6c823fb6214ad2b80052bb88ab22ca606f8d4c4f08602ed"

RPROVIDES:${PN} += "update-test-reboot-needed update-test-reboot-needed(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
