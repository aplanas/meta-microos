SUMMARY = "Translations for package plymouth"
DESCRIPTION = "Provides translations for the 'plymouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-lang-22.02.122+94.4bd41a3-5.1.noarch.rpm"
RPM_HASH = "5c11af166740be25c0cf0b31c10b0f04718c2b95185493cc333fe9873ef1c6d74aee8f255421f5da2ee5b4bfc3e231dc0db7b918708b4cf9ec868387e0ff96e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plymouth:be) locale(plymouth:cs) locale(plymouth:da) locale(plymouth:de) locale(plymouth:eo) locale(plymouth:es) locale(plymouth:eu) locale(plymouth:fa) locale(plymouth:fi) locale(plymouth:fr) locale(plymouth:fur) locale(plymouth:he) locale(plymouth:hr) locale(plymouth:hu) locale(plymouth:id) locale(plymouth:it) locale(plymouth:ka) locale(plymouth:lt) locale(plymouth:ms) locale(plymouth:nl) locale(plymouth:pa) locale(plymouth:pl) locale(plymouth:pt) locale(plymouth:pt_BR) locale(plymouth:ro) locale(plymouth:ru) locale(plymouth:si) locale(plymouth:sk) locale(plymouth:sr) locale(plymouth:sv) locale(plymouth:tr) locale(plymouth:uk) locale(plymouth:zh_CN) locale(plymouth:zh_HK) locale(plymouth:zh_TW) plymouth-lang plymouth-lang-all"
RDEPENDS:${PN} += "plymouth"

inherit rpm
