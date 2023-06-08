SUMMARY = "Translations for package kio-gdrive"
DESCRIPTION = "Provides translations for the 'kio-gdrive' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kio-gdrive-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "e4b77d7c4f0237b0f8d1f1a6a5641ecac95a1a5ceb279b065c508bc40761e750f1c1bafbc66efa43cdd715b09b6e1b6b9619210b0f1a8df059ed225021ee266d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-gdrive-lang kio-gdrive-lang-all locale(kio-gdrive:ar) locale(kio-gdrive:az) locale(kio-gdrive:be) locale(kio-gdrive:ca) locale(kio-gdrive:ca@valencia) locale(kio-gdrive:cs) locale(kio-gdrive:da) locale(kio-gdrive:de) locale(kio-gdrive:el) locale(kio-gdrive:en_GB) locale(kio-gdrive:es) locale(kio-gdrive:et) locale(kio-gdrive:eu) locale(kio-gdrive:fi) locale(kio-gdrive:fr) locale(kio-gdrive:gl) locale(kio-gdrive:he) locale(kio-gdrive:hi) locale(kio-gdrive:hu) locale(kio-gdrive:ia) locale(kio-gdrive:id) locale(kio-gdrive:it) locale(kio-gdrive:ja) locale(kio-gdrive:ka) locale(kio-gdrive:ko) locale(kio-gdrive:lt) locale(kio-gdrive:nl) locale(kio-gdrive:nn) locale(kio-gdrive:pl) locale(kio-gdrive:pt) locale(kio-gdrive:pt_BR) locale(kio-gdrive:ro) locale(kio-gdrive:ru) locale(kio-gdrive:sk) locale(kio-gdrive:sl) locale(kio-gdrive:sv) locale(kio-gdrive:ta) locale(kio-gdrive:tr) locale(kio-gdrive:uk) locale(kio-gdrive:zh_CN) locale(kio-gdrive:zh_TW)"
RDEPENDS:${PN} += "kio-gdrive"

inherit rpm
