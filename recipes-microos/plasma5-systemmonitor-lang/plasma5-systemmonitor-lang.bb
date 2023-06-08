SUMMARY = "Translations for package plasma5-systemmonitor"
DESCRIPTION = "Provides translations for the 'plasma5-systemmonitor' package."
LICENSE = "GPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "plasma5-systemmonitor-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "734cab559b8681e2d0d63eaba92b4d2a447c1263fabd0f24ea63e63877b62e353c84a0751e55a01128be99cf52a0155ce3c04a78d5e3161895589ce1b4587980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-systemmonitor:ar) locale(plasma5-systemmonitor:az) locale(plasma5-systemmonitor:bg) locale(plasma5-systemmonitor:ca) locale(plasma5-systemmonitor:ca@valencia) locale(plasma5-systemmonitor:cs) locale(plasma5-systemmonitor:da) locale(plasma5-systemmonitor:de) locale(plasma5-systemmonitor:en_GB) locale(plasma5-systemmonitor:es) locale(plasma5-systemmonitor:eu) locale(plasma5-systemmonitor:fi) locale(plasma5-systemmonitor:fr) locale(plasma5-systemmonitor:gl) locale(plasma5-systemmonitor:hu) locale(plasma5-systemmonitor:ia) locale(plasma5-systemmonitor:id) locale(plasma5-systemmonitor:it) locale(plasma5-systemmonitor:ja) locale(plasma5-systemmonitor:ka) locale(plasma5-systemmonitor:ko) locale(plasma5-systemmonitor:lt) locale(plasma5-systemmonitor:nb) locale(plasma5-systemmonitor:nl) locale(plasma5-systemmonitor:nn) locale(plasma5-systemmonitor:pa) locale(plasma5-systemmonitor:pl) locale(plasma5-systemmonitor:pt) locale(plasma5-systemmonitor:pt_BR) locale(plasma5-systemmonitor:ro) locale(plasma5-systemmonitor:ru) locale(plasma5-systemmonitor:sk) locale(plasma5-systemmonitor:sl) locale(plasma5-systemmonitor:sv) locale(plasma5-systemmonitor:ta) locale(plasma5-systemmonitor:tr) locale(plasma5-systemmonitor:uk) locale(plasma5-systemmonitor:zh_CN) locale(plasma5-systemmonitor:zh_TW) plasma5-systemmonitor-lang plasma5-systemmonitor-lang-all"
RDEPENDS:${PN} += "plasma5-systemmonitor"

inherit rpm
