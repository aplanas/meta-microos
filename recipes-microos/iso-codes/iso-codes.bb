SUMMARY = "ISO Code Lists and Translations"
DESCRIPTION = "This package provides the ISO-639 language code list, the ISO-3166 \
territory code list, ISO-3166-2 subterritory lists, and all their \
translations in gettext .po form."
LICENSE = "LGPL-2.1-or-later"

PV = "4.13.0"

RPM_NAME = "iso-codes-4.13.0-1.1.noarch.rpm"
RPM_HASH = "128f41cb47bb9567093a8ce1c671a794d8d3d9bf3fd1d395af285f33e4e0cb9ba8d07b5807519077fe2af48bbaaacf44d725e676383c7b91cc97f2495f843fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes"
RDEPENDS:${PN} += ""

inherit rpm
