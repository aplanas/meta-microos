SUMMARY = "Translations for package gtkam"
DESCRIPTION = "Provides translations for the 'gtkam' package."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "gtkam-lang-1.0-2.27.noarch.rpm"
RPM_HASH = "969b39228d5ed01b0c5ac545046c11879987ac109d86ab74179775c260943ad759450d4d7f6a41cf25993a230322dee8c248c23ff7c00b0296d3a766fad1d7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtkam-lang gtkam-lang-all locale(gtkam:be) locale(gtkam:cs) locale(gtkam:da) locale(gtkam:de) locale(gtkam:eo) locale(gtkam:es) locale(gtkam:fi) locale(gtkam:fr) locale(gtkam:hu) locale(gtkam:id) locale(gtkam:is) locale(gtkam:it) locale(gtkam:ja) locale(gtkam:nb) locale(gtkam:nl) locale(gtkam:pa) locale(gtkam:pl) locale(gtkam:pt) locale(gtkam:pt_BR) locale(gtkam:ru) locale(gtkam:sk) locale(gtkam:sl) locale(gtkam:sr) locale(gtkam:sv) locale(gtkam:uk) locale(gtkam:vi) locale(gtkam:zh_CN)"
RDEPENDS:${PN} += "gtkam"

inherit rpm
