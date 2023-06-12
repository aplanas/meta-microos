SUMMARY = "Translations for package kImageAnnotator"
DESCRIPTION = "Provides translations for the 'kImageAnnotator' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.1"

RPM_NAME = "kImageAnnotator-lang-0.6.1-1.1.noarch.rpm"
RPM_HASH = "5572ebaddc9e71ef2f056d7e36a9776a6597f729e0ff97fb0fac319f58d57f75722d5cb817733a7f7c09434990977abcb357dc4250afa900aa3a0d07d2317f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kImageAnnotator-lang \
kImageAnnotator-lang-all"
RDEPENDS:${PN} += "kImageAnnotator"

inherit rpm
