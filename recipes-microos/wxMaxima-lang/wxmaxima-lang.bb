SUMMARY = "Translations for package wxMaxima"
DESCRIPTION = "Provides translations for the 'wxMaxima' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.03.0"

RPM_NAME = "wxMaxima-lang-23.03.0-1.4.noarch.rpm"
RPM_HASH = "e6b8333e65a31832324a636a26f8d1383ad978b2b31f9bae71ff7f6fd03d23f3e084eb4570cb22739095a91eba9e7bdef2ae1d1bd9afef6432fba12baa37dcf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wxMaxima:ca) locale(wxMaxima:cs) locale(wxMaxima:da) locale(wxMaxima:de) locale(wxMaxima:el) locale(wxMaxima:en) locale(wxMaxima:es) locale(wxMaxima:fi) locale(wxMaxima:fr) locale(wxMaxima:gl) locale(wxMaxima:hu) locale(wxMaxima:it) locale(wxMaxima:ja) locale(wxMaxima:nb) locale(wxMaxima:pl) locale(wxMaxima:pt_BR) locale(wxMaxima:ru) locale(wxMaxima:tr) locale(wxMaxima:uk) locale(wxMaxima:zh_CN) locale(wxMaxima:zh_TW) wxMaxima-lang wxMaxima-lang-all"
RDEPENDS:${PN} += "wxMaxima"

inherit rpm
