SUMMARY = "ISO code lists and translations"
DESCRIPTION = "This package provides the ISO-639 Language code list, the ISO-3166 \
Territory code list, and ISO-3166-2 sub-territory lists, and all their \
translations in gettext .po form."
LICENSE = "LGPL-2.1-or-later"

PV = "4.15.0"

RPM_NAME = "iso-codes-devel-4.15.0-1.1.noarch.rpm"
RPM_HASH = "c8048164b2e86d67a2b33262f07805787e2f6ba4a279d0c336abee4377cc3cc971493a6eeed65cd84aca02ddd13386043af80fb671683875c89fb334cdd80bc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes-devel \
pkgconfig(iso-codes)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
iso-codes"

inherit rpm
