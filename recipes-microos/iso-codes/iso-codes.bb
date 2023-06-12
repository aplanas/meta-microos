SUMMARY = "ISO Code Lists and Translations"
DESCRIPTION = "This package provides the ISO-639 language code list, the ISO-3166 \
territory code list, ISO-3166-2 subterritory lists, and all their \
translations in gettext .po form."
LICENSE = "LGPL-2.1-or-later"

PV = "4.15.0"

RPM_NAME = "iso-codes-4.15.0-1.1.noarch.rpm"
RPM_HASH = "6a5024e33e140f189d5f2e4a174da9ea26f1c3d0562badcb60dec061f7f1a3cbcb776f182e19c1e7cf1915cc5e785fa86973d5bca3cdb966c0d57554536aff8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "iso-codes"
RDEPENDS:${PN} += ""

inherit rpm
