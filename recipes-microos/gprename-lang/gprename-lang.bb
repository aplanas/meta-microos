SUMMARY = "Translations for package gprename"
DESCRIPTION = "Provides translations for the 'gprename' package."
LICENSE = "GPL-3.0+"

PV = "5.0.20220807"

RPM_NAME = "gprename-lang-5.0.20220807-1.2.noarch.rpm"
RPM_HASH = "644f246043a31d9c1e48632288f358d869d6f7d1506b131ab1682e5d46f06aa5cd2f7829973d0058f2ce0b67b6ca398690e389e4fe21aeb4df1da01e3dceac53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gprename-lang \
gprename-lang-all \
locale(gprename:ca) \
locale(gprename:de) \
locale(gprename:es) \
locale(gprename:et) \
locale(gprename:fr) \
locale(gprename:id) \
locale(gprename:it) \
locale(gprename:nl) \
locale(gprename:pl) \
locale(gprename:pt_BR) \
locale(gprename:ro) \
locale(gprename:ru) \
locale(gprename:sv) \
locale(gprename:zh_CN)"
RDEPENDS:${PN} += "gprename"

inherit rpm
