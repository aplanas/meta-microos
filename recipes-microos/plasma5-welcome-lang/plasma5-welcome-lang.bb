SUMMARY = "Translations for package plasma5-welcome"
DESCRIPTION = "Provides translations for the 'plasma5-welcome' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-welcome-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "adf4f167711e9acc4b175d41dce6c5abe8c61e6407597e3b6aae2760ecc1e6a132fc50e5d4e9202e4b001f0a47075b2403fc7f0e4f1173532bc63a8ac812ef16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-welcome:ar) locale(plasma5-welcome:ca) locale(plasma5-welcome:ca@valencia) locale(plasma5-welcome:cs) locale(plasma5-welcome:de) locale(plasma5-welcome:en_GB) locale(plasma5-welcome:es) locale(plasma5-welcome:eu) locale(plasma5-welcome:fi) locale(plasma5-welcome:fr) locale(plasma5-welcome:ia) locale(plasma5-welcome:id) locale(plasma5-welcome:is) locale(plasma5-welcome:it) locale(plasma5-welcome:ja) locale(plasma5-welcome:ka) locale(plasma5-welcome:ko) locale(plasma5-welcome:nl) locale(plasma5-welcome:nn) locale(plasma5-welcome:pa) locale(plasma5-welcome:pl) locale(plasma5-welcome:pt) locale(plasma5-welcome:pt_BR) locale(plasma5-welcome:ru) locale(plasma5-welcome:sk) locale(plasma5-welcome:sl) locale(plasma5-welcome:tr) locale(plasma5-welcome:uk) locale(plasma5-welcome:zh_CN) locale(plasma5-welcome:zh_TW) plasma5-welcome-lang plasma5-welcome-lang-all"
RDEPENDS:${PN} += "plasma5-welcome"

inherit rpm
