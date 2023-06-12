SUMMARY = "Translations for package ktextaddons"
DESCRIPTION = "Provides translations for the 'ktextaddons' package."
LICENSE = "LGPL-2.0-or-later & GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "ktextaddons-lang-1.1.0-1.1.noarch.rpm"
RPM_HASH = "8aa3128fc7bad042ee086bf8e7063781b97bea614ea74d27cc8e8eed3905b87251132bb56df62578acdeed85ed9287a548cb2e7673892a37650c31bbe3622951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktextaddons-lang \
ktextaddons-lang-all \
locale(ktextaddons:ar) \
locale(ktextaddons:az) \
locale(ktextaddons:bg) \
locale(ktextaddons:ca) \
locale(ktextaddons:ca@valencia) \
locale(ktextaddons:cs) \
locale(ktextaddons:da) \
locale(ktextaddons:de) \
locale(ktextaddons:en_GB) \
locale(ktextaddons:es) \
locale(ktextaddons:et) \
locale(ktextaddons:eu) \
locale(ktextaddons:fi) \
locale(ktextaddons:fr) \
locale(ktextaddons:gl) \
locale(ktextaddons:ia) \
locale(ktextaddons:it) \
locale(ktextaddons:ka) \
locale(ktextaddons:ko) \
locale(ktextaddons:nl) \
locale(ktextaddons:pl) \
locale(ktextaddons:pt) \
locale(ktextaddons:pt_BR) \
locale(ktextaddons:ru) \
locale(ktextaddons:sk) \
locale(ktextaddons:sl) \
locale(ktextaddons:sv) \
locale(ktextaddons:tr) \
locale(ktextaddons:uk)"
RDEPENDS:${PN} += "ktextaddons"

inherit rpm
