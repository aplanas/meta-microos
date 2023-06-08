SUMMARY = "YaST2 - Lithuanian Translations"
DESCRIPTION = "YaST2 - Translations for Lithuanian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-lt-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "2847b10116661ad33945c0badc9eaf4cafd55eb633f3ad681333a796e55f2b642169e3e51cd0cd4f955fd3d7b34b1b4a81bca3729b47960c3551113538d77365"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:lt) yast2-trans-lt"
RDEPENDS:${PN} += ""

inherit rpm
