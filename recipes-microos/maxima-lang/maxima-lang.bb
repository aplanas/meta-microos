SUMMARY = "Translations for package maxima"
DESCRIPTION = "Provides translations for the maxima package."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-lang-5.46.0-1.20.noarch.rpm"
RPM_HASH = "b48b548b8cdc68b60fe47a2a10468d687b63640a3362de34a837fff52b094a59f8d6c202d58140639119d2a323bb44ca22a5ae0cb8722ccc96d35ecc5fe4f0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(maxima:es) locale(maxima:pt) maxima-lang maxima-lang-de-utf8 maxima-lang-es-utf8 maxima-lang-pt-utf8 maxima-lang-pt_BR-utf8"
RDEPENDS:${PN} += "maxima"

inherit rpm
