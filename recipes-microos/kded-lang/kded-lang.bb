SUMMARY = "Translations for package kded"
DESCRIPTION = "Provides translations for the 'kded' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "kded-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "26a42a82648e470fdc5879828401e8a88ea05743651eb48451faf6afdeccab2cae60caacc94a7a02a4429ebbf7ae6ca06d17d47cd479fb578bc6970041c999fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kded-lang \
kded-lang-all"
RDEPENDS:${PN} += "kded"

inherit rpm
