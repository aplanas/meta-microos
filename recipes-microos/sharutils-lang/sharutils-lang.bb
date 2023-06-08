SUMMARY = "Translations for package sharutils"
DESCRIPTION = "Provides translations for the 'sharutils' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.2"

RPM_NAME = "sharutils-lang-4.15.2-7.6.noarch.rpm"
RPM_HASH = "05b376c12390cec5a6a98fa20fa19ffa12fe02299dadfb6f9084fcd09d012a4865523e14520c5369b6ff8b90dd09fbdb30191771cefffa1400070165d1d84894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(sharutils:bg) locale(sharutils:ca) locale(sharutils:cs) locale(sharutils:da) locale(sharutils:de) locale(sharutils:el) locale(sharutils:eo) locale(sharutils:es) locale(sharutils:et) locale(sharutils:fi) locale(sharutils:fr) locale(sharutils:ga) locale(sharutils:gl) locale(sharutils:hu) locale(sharutils:id) locale(sharutils:it) locale(sharutils:ja) locale(sharutils:nl) locale(sharutils:pl) locale(sharutils:pt_BR) locale(sharutils:ru) locale(sharutils:sr) locale(sharutils:sv) locale(sharutils:tr) locale(sharutils:uk) locale(sharutils:vi) locale(sharutils:zh_CN) locale(sharutils:zh_TW) sharutils-lang sharutils-lang-all"
RDEPENDS:${PN} += "sharutils"

inherit rpm
