SUMMARY = "LibreOffice spellchecker/hyphenator for finnish language"
DESCRIPTION = "LibreOffice spellchecker/hyphenator for finnish language, which uses \
libvoikko as backend."
LICENSE = "GPL-3.0-or-later | MPL-2.0"

PV = "5.0"

RPM_NAME = "libreoffice-voikko-5.0-6.1.aarch64.rpm"
RPM_HASH = "0db0423843fc2fcf63ad2bb3e13103377cb91d564ec28f77d8c322bcf952c9d7791534ade4f1509043c99d5ccbb7610ac4224f70a221aa97678315c5910f08e2"

RPROVIDES:${PN} += "libreoffice-voikko libreoffice-voikko(aarch-64) locale(libreoffice:fi)"
RDEPENDS:${PN} += "python3-libvoikko"

inherit rpm
