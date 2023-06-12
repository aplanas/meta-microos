SUMMARY = "MATE Desktop Environment"
DESCRIPTION = "The MATE desktop environment is a desktop environment using traditional metaphors."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate-20170319-5.3.aarch64.rpm"
RPM_HASH = "3fc25af687849605d1ad402957028f1744b4f540a995678d0d1d578d7524b360b82a85f4ac52e7197d82ab9b6621134b41ce85713234fa54dd8dcf18faf88ec6"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-icon() \
pattern-order() \
pattern-visible() \
patterns-mate-mate \
patterns-mate-mate(aarch-64)"
RDEPENDS:${PN} += "pattern()"

inherit rpm
