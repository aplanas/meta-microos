SUMMARY = "Translations for package kontrast"
DESCRIPTION = "Provides translations for the 'kontrast' package."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.04.1"

RPM_NAME = "kontrast-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "1873eea7c10c55e082a08d2923ea450e2ac9e626a80b709d8e9eb1245717f81fce6a0cb86ecd9b1bb2db629ee9c81aba2acac848d78641bda8fd4233fa0ae035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kontrast-lang \
kontrast-lang-all \
locale(kontrast:ca) \
locale(kontrast:ca@valencia) \
locale(kontrast:cs) \
locale(kontrast:da) \
locale(kontrast:de) \
locale(kontrast:el) \
locale(kontrast:en_GB) \
locale(kontrast:es) \
locale(kontrast:eu) \
locale(kontrast:fi) \
locale(kontrast:fr) \
locale(kontrast:it) \
locale(kontrast:ja) \
locale(kontrast:ka) \
locale(kontrast:ko) \
locale(kontrast:lt) \
locale(kontrast:nl) \
locale(kontrast:nn) \
locale(kontrast:pa) \
locale(kontrast:pl) \
locale(kontrast:pt) \
locale(kontrast:pt_BR) \
locale(kontrast:ru) \
locale(kontrast:sk) \
locale(kontrast:sl) \
locale(kontrast:sv) \
locale(kontrast:tr) \
locale(kontrast:uk) \
locale(kontrast:zh_CN) \
locale(kontrast:zh_TW)"
RDEPENDS:${PN} += "kontrast"

inherit rpm
