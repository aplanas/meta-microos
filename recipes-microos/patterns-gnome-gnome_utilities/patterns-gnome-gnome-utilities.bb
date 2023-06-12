SUMMARY = "GNOME Utilities"
DESCRIPTION = "GNOME Utilities"
LICENSE = "MIT"

PV = "20201210"

RPM_NAME = "patterns-gnome-gnome_utilities-20201210-16.1.aarch64.rpm"
RPM_HASH = "c7da1475bbb83bd3c932250174d03b2500ab0f445e004c8898b98cfe07c01a401dddc9cf1441ceb5bf04adba89ddd2f4bc21064de95dee51ac64580b9fa31a5f"

RPROVIDES:${PN} += "pattern() \
pattern-category() \
pattern-extends() \
pattern-icon() \
pattern-order() \
patterns-gnome-gnome_utilities \
patterns-gnome-gnome_utilities(aarch-64) \
patterns-openSUSE-gnome_utilities"
RDEPENDS:${PN} += "pattern()"

inherit rpm
