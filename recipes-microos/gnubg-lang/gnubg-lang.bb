SUMMARY = "Translations for package gnubg"
DESCRIPTION = "Provides translations for the 'gnubg' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.06.002"

RPM_NAME = "gnubg-lang-1.06.002-3.4.noarch.rpm"
RPM_HASH = "b2f153d7f1b5d6386bafa039debe4896aab7f9b281a1a900b0398ed4fc341d993e1f315621306db523e11b8be1474dde53c964c9a644207c2ffad53c8bb1c97f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnubg-lang \
gnubg-lang-all \
locale(gnubg:cs) \
locale(gnubg:da) \
locale(gnubg:de) \
locale(gnubg:el) \
locale(gnubg:en_US) \
locale(gnubg:es) \
locale(gnubg:fr) \
locale(gnubg:is) \
locale(gnubg:it) \
locale(gnubg:ja) \
locale(gnubg:ro) \
locale(gnubg:ru) \
locale(gnubg:tr)"
RDEPENDS:${PN} += "gnubg"

inherit rpm
