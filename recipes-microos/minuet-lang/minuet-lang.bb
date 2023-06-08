SUMMARY = "Translations for package minuet"
DESCRIPTION = "Provides translations for the 'minuet' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "minuet-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "08293478b248bd1c88a4b82f705a4fd7fb244f3039415eaf730a89695333cb6044a1b7825b9872a494a3870d5aaadb0a7ba92296884d3978be3267fa0ffd903d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(minuet:ar) locale(minuet:ca) locale(minuet:ca@valencia) locale(minuet:cs) locale(minuet:da) locale(minuet:de) locale(minuet:en_GB) locale(minuet:es) locale(minuet:et) locale(minuet:fi) locale(minuet:fr) locale(minuet:gl) locale(minuet:it) locale(minuet:ja) locale(minuet:ka) locale(minuet:ko) locale(minuet:lt) locale(minuet:ml) locale(minuet:nl) locale(minuet:nn) locale(minuet:pl) locale(minuet:pt) locale(minuet:pt_BR) locale(minuet:ru) locale(minuet:sk) locale(minuet:sl) locale(minuet:sv) locale(minuet:tr) locale(minuet:uk) locale(minuet:zh_CN) locale(minuet:zh_TW) minuet-lang minuet-lang-all"
RDEPENDS:${PN} += "minuet"

inherit rpm
