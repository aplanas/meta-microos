SUMMARY = "Common files for the 'Paper' Gtk theme"
DESCRIPTION = "Paper is a modern desktop theme suite. Its design is mostly flat \
with a minimal use of shadows for depth."
LICENSE = "GPL-3.0+"

PV = "2.1.0"

RPM_NAME = "metatheme-paper-common-2.1.0-2.16.noarch.rpm"
RPM_HASH = "dc15565a987150b5309abdd24008aadc4fdc03a539551e89ea85dca1522a026f078e0947e06b1693b4776d3ad7edd747172cfdb79fce9ee81681f1ba5ee3e64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-paper-common paper-gtk-theme"
RDEPENDS:${PN} += ""

inherit rpm
