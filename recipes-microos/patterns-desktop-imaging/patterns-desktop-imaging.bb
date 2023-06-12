SUMMARY = "Graphics"
DESCRIPTION = "Handling of digital photos and graphics."
LICENSE = "MIT"

PV = "20201106"

RPM_NAME = "patterns-desktop-imaging-20201106-3.5.aarch64.rpm"
RPM_HASH = "f6010d95c474f2241e45d89a0e02c8efa89edf90fb419b271fa089bf461043c8b99c2f1e07612cf9ca64c9f9fbaebd7a6d940b23f315ab6a9827335e9d59c631"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-desktop-imaging \
patterns-desktop-imaging(aarch-64) \
patterns-openSUSE-imaging"
RDEPENDS:${PN} += "pattern()"

inherit rpm
