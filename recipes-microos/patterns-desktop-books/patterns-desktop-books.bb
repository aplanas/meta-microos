SUMMARY = "Documentation"
DESCRIPTION = "Help and Documentation, various books."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-books-20201106-3.5.aarch64.rpm"
RPM_HASH = "552459812781e84af16b136a0736d37b88c78275a1b33ac902cfcaa85ec35405b1e6f14e75bc606cb0f57be34f60f3565e9a982ef5354e88430877b6045e4d80"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-desktop-books \
patterns-desktop-books(aarch-64) \
patterns-openSUSE-books"
RDEPENDS:${PN} += ""

inherit rpm
