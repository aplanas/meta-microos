SUMMARY = "Translations for package plymouth"
DESCRIPTION = "Provides translations for the 'plymouth' package."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-lang-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "4cb1c13d55632c2abe1a056da6e4085d97ee3998106f72d6f6a0e5db3f4fef4e9ea53b7ea50421484e0b44902b28ef51d5f721481ce88531d3083f52677687b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plymouth:be) locale(plymouth:cs) locale(plymouth:da) locale(plymouth:de) locale(plymouth:eo) locale(plymouth:es) locale(plymouth:eu) locale(plymouth:fa) locale(plymouth:fi) locale(plymouth:fr) locale(plymouth:fur) locale(plymouth:he) locale(plymouth:hr) locale(plymouth:hu) locale(plymouth:id) locale(plymouth:it) locale(plymouth:ka) locale(plymouth:lt) locale(plymouth:ms) locale(plymouth:nl) locale(plymouth:pa) locale(plymouth:pl) locale(plymouth:pt) locale(plymouth:pt_BR) locale(plymouth:ro) locale(plymouth:ru) locale(plymouth:si) locale(plymouth:sk) locale(plymouth:sr) locale(plymouth:sv) locale(plymouth:tr) locale(plymouth:uk) locale(plymouth:zh_CN) locale(plymouth:zh_HK) locale(plymouth:zh_TW) plymouth-lang plymouth-lang-all"
RDEPENDS:${PN} += "plymouth"

inherit rpm
