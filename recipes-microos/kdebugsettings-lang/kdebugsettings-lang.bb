SUMMARY = "Translations for package kdebugsettings"
DESCRIPTION = "Provides translations for the 'kdebugsettings' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdebugsettings-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7e64c96f8b006c04d3c59724a52d96cea41f4984d94422d14effda32643638b43e374a2a87d4a5396cae1aef0ea720d534f410c8038d20f41221bfdbb6c9171b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebugsettings-lang kdebugsettings-lang-all locale(kdebugsettings:ar) locale(kdebugsettings:az) locale(kdebugsettings:ca) locale(kdebugsettings:ca@valencia) locale(kdebugsettings:cs) locale(kdebugsettings:da) locale(kdebugsettings:de) locale(kdebugsettings:el) locale(kdebugsettings:en_GB) locale(kdebugsettings:es) locale(kdebugsettings:et) locale(kdebugsettings:eu) locale(kdebugsettings:fi) locale(kdebugsettings:fr) locale(kdebugsettings:gl) locale(kdebugsettings:hu) locale(kdebugsettings:ia) locale(kdebugsettings:it) locale(kdebugsettings:ja) locale(kdebugsettings:ka) locale(kdebugsettings:ko) locale(kdebugsettings:lt) locale(kdebugsettings:nl) locale(kdebugsettings:nn) locale(kdebugsettings:pl) locale(kdebugsettings:pt) locale(kdebugsettings:pt_BR) locale(kdebugsettings:ro) locale(kdebugsettings:ru) locale(kdebugsettings:sk) locale(kdebugsettings:sl) locale(kdebugsettings:sr) locale(kdebugsettings:sr@ijekavian) locale(kdebugsettings:sr@ijekavianlatin) locale(kdebugsettings:sr@latin) locale(kdebugsettings:sv) locale(kdebugsettings:tr) locale(kdebugsettings:uk) locale(kdebugsettings:zh_CN) locale(kdebugsettings:zh_TW)"
RDEPENDS:${PN} += "kdebugsettings"

inherit rpm
