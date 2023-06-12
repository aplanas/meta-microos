SUMMARY = "Translations for package minuet"
DESCRIPTION = "Provides translations for the 'minuet' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "minuet-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "0a8230dd5a163b6e3c95a69b16d18bfd5084eb91645cfe0e84aae40d4af9fb45d7c70ca2fd0b0219c1f475f3af25de2e8a28cc0c74c377a8a72bc1e6f1e3b511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(minuet:ar) locale(minuet:ca) locale(minuet:ca@valencia) locale(minuet:cs) locale(minuet:da) locale(minuet:de) locale(minuet:en_GB) locale(minuet:es) locale(minuet:et) locale(minuet:fi) locale(minuet:fr) locale(minuet:gl) locale(minuet:it) locale(minuet:ja) locale(minuet:ka) locale(minuet:ko) locale(minuet:lt) locale(minuet:ml) locale(minuet:nl) locale(minuet:nn) locale(minuet:pl) locale(minuet:pt) locale(minuet:pt_BR) locale(minuet:ru) locale(minuet:sk) locale(minuet:sl) locale(minuet:sv) locale(minuet:tr) locale(minuet:uk) locale(minuet:zh_CN) locale(minuet:zh_TW) minuet-lang minuet-lang-all"
RDEPENDS:${PN} += "minuet"

inherit rpm
