SUMMARY = "Translations for package tuxpaint-config"
DESCRIPTION = "Provides translations for the 'tuxpaint-config' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.18"

RPM_NAME = "tuxpaint-config-lang-0.0.18-1.7.noarch.rpm"
RPM_HASH = "05c1d5dd52be1c7278b6d3ca055635206667b300821b818579d3e60f507163dfd01936053facdfe8066f948df2db7d5dfdda49279f0c99bf49ce3c4ca116e736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tuxpaint-config:ar) locale(tuxpaint-config:ast) locale(tuxpaint-config:bg) locale(tuxpaint-config:ca) locale(tuxpaint-config:cs) locale(tuxpaint-config:da) locale(tuxpaint-config:de) locale(tuxpaint-config:el) locale(tuxpaint-config:en_GB) locale(tuxpaint-config:eo) locale(tuxpaint-config:es) locale(tuxpaint-config:eu) locale(tuxpaint-config:fi) locale(tuxpaint-config:fr) locale(tuxpaint-config:gd) locale(tuxpaint-config:gl) locale(tuxpaint-config:hi) locale(tuxpaint-config:id) locale(tuxpaint-config:is) locale(tuxpaint-config:it) locale(tuxpaint-config:ja) locale(tuxpaint-config:ka) locale(tuxpaint-config:lv) locale(tuxpaint-config:ms) locale(tuxpaint-config:nl) locale(tuxpaint-config:nn) locale(tuxpaint-config:pl) locale(tuxpaint-config:pt) locale(tuxpaint-config:pt_BR) locale(tuxpaint-config:ro) locale(tuxpaint-config:ru) locale(tuxpaint-config:sk) locale(tuxpaint-config:sl) locale(tuxpaint-config:sq) locale(tuxpaint-config:sr) locale(tuxpaint-config:sr@latin) locale(tuxpaint-config:sv) locale(tuxpaint-config:tr) locale(tuxpaint-config:uk) locale(tuxpaint-config:vi) locale(tuxpaint-config:zh_TW) tuxpaint-config-lang tuxpaint-config-lang-all"
RDEPENDS:${PN} += "tuxpaint-config"

inherit rpm
