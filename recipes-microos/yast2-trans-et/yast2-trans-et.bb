SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230507.125aa699e6"

RPM_NAME = "yast2-trans-et-84.87.20230507.125aa699e6-1.1.noarch.rpm"
RPM_HASH = "54a45fa32c08edcaafb4f50363b20c0b40cec6ccd5b7d0ef93c3419ce402085d56217b4e3e8bb7809a3a09f86e5a358dc5db65362d8755bfd951267b70a47e30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(yast2:et) yast2-trans-et"
RDEPENDS:${PN} += ""

inherit rpm
