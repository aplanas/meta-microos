SUMMARY = "Test update that should be marked as retracted"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should mark the update as retracted \
in zypper."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-retracted-5.1-1.17.aarch64.rpm"
RPM_HASH = "4ee6129168fa8ee7dfb132036d8b204a3961c4d7afbfd6a3225c37d60dcee9a8c49e3c4fdae66209c23563c93bcbc6dcd0850e96847f936dcfd2f4895249ec92"

RPROVIDES:${PN} += "update-test-retracted update-test-retracted(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
