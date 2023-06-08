SUMMARY = "Translations for package obconf-qt"
DESCRIPTION = "Provides translations for the 'obconf-qt' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.16.2"

RPM_NAME = "obconf-qt-lang-0.16.2-1.7.noarch.rpm"
RPM_HASH = "88c0c85509d2aa5aed5cf703814f155960ae9c58fe7b497c98f76c3c2cf3e6a1ad335ab07cc2c4f5b29958fbf76acd721390a64ffdd8bb4b8b1b6d57a3e2859b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obconf-qt-lang obconf-qt-lang-all"
RDEPENDS:${PN} += "obconf-qt"

inherit rpm
