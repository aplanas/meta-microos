SUMMARY = "Test update that includes new features"
DESCRIPTION = "Package for testing the update stack during product development. \
 \
An update for this package should have its category set to \
'feature', indicating that it includes a new feature and not \
only fixes."
LICENSE = "GPL-2.0+"

PV = "5.1"

RPM_NAME = "update-test-feature-5.1-1.17.aarch64.rpm"
RPM_HASH = "2a834ee0deff6b2e874b8f0379e72d1a40a7d5ff0e3334bbb7761238c4689604fc0247e4d1bf84723052c3cbc763a1b87ed3f3c898c8754665da919bdf66dbf2"

RPROVIDES:${PN} += "update-test-feature update-test-feature(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
