SUMMARY = "Translations for package ksanecore"
DESCRIPTION = "Provides translations for the 'ksanecore' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "ksanecore-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "10a85bc1bba5b75d227c960336e615f258f362f0543e247f9541aa49f8766e75d036e504ad196c976999c67061f2047c1bf5670b356bc2e0c64811ee7a53a780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksanecore-lang ksanecore-lang-all locale(ksanecore:ar) locale(ksanecore:bg) locale(ksanecore:ca) locale(ksanecore:ca@valencia) locale(ksanecore:cs) locale(ksanecore:de) locale(ksanecore:en_GB) locale(ksanecore:es) locale(ksanecore:eu) locale(ksanecore:fi) locale(ksanecore:fr) locale(ksanecore:hi) locale(ksanecore:it) locale(ksanecore:ja) locale(ksanecore:ka) locale(ksanecore:ko) locale(ksanecore:lt) locale(ksanecore:nl) locale(ksanecore:nn) locale(ksanecore:pl) locale(ksanecore:pt) locale(ksanecore:pt_BR) locale(ksanecore:ro) locale(ksanecore:ru) locale(ksanecore:sk) locale(ksanecore:sl) locale(ksanecore:sv) locale(ksanecore:tr) locale(ksanecore:uk) locale(ksanecore:zh_CN) locale(ksanecore:zh_TW)"
RDEPENDS:${PN} += "ksanecore"

inherit rpm
