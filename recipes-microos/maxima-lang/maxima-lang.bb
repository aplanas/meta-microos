SUMMARY = "Translations for package maxima"
DESCRIPTION = "Provides translations for the maxima package."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-lang-5.46.0-1.19.noarch.rpm"
RPM_HASH = "e2c40f64c94b2d98c426431d64eb6fced1e0423c3b1e0c88a5bd9bdcb1097f92632b2eb3cd574dbe2086d4d2bd978e1accd033f884c434fc38d5a180a4a9d3f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(maxima:es) locale(maxima:pt) maxima-lang maxima-lang-de-utf8 maxima-lang-es-utf8 maxima-lang-pt-utf8 maxima-lang-pt_BR-utf8"
RDEPENDS:${PN} += "maxima"

inherit rpm
