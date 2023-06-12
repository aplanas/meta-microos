SUMMARY = "Translations for package libkdegames"
DESCRIPTION = "Provides translations for the 'libkdegames' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "libkdegames-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "18e7f4fef43f92c06bd28b26189488ff6bf723e4a308e9082b9331a9dda1e1be53c2cfd75d04485a63d54cd364a0f903d09933fb04a0c2575835d8819b70bac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdegames-lang libkdegames-lang-all locale(libkdegames:af) locale(libkdegames:ar) locale(libkdegames:be) locale(libkdegames:bg) locale(libkdegames:bn) locale(libkdegames:br) locale(libkdegames:bs) locale(libkdegames:ca) locale(libkdegames:ca@valencia) locale(libkdegames:cs) locale(libkdegames:cy) locale(libkdegames:da) locale(libkdegames:de) locale(libkdegames:el) locale(libkdegames:en_GB) locale(libkdegames:eo) locale(libkdegames:es) locale(libkdegames:et) locale(libkdegames:eu) locale(libkdegames:fa) locale(libkdegames:fi) locale(libkdegames:fr) locale(libkdegames:ga) locale(libkdegames:gl) locale(libkdegames:he) locale(libkdegames:hi) locale(libkdegames:hr) locale(libkdegames:hu) locale(libkdegames:id) locale(libkdegames:is) locale(libkdegames:it) locale(libkdegames:ja) locale(libkdegames:ka) locale(libkdegames:kk) locale(libkdegames:km) locale(libkdegames:ko) locale(libkdegames:lt) locale(libkdegames:lv) locale(libkdegames:mai) locale(libkdegames:mk) locale(libkdegames:ml) locale(libkdegames:mr) locale(libkdegames:nb) locale(libkdegames:nds) locale(libkdegames:ne) locale(libkdegames:nl) locale(libkdegames:nn) locale(libkdegames:oc) locale(libkdegames:pa) locale(libkdegames:pl) locale(libkdegames:pt) locale(libkdegames:pt_BR) locale(libkdegames:ro) locale(libkdegames:ru) locale(libkdegames:sk) locale(libkdegames:sl) locale(libkdegames:sq) locale(libkdegames:sr) locale(libkdegames:sr@ijekavian) locale(libkdegames:sr@ijekavianlatin) locale(libkdegames:sr@latin) locale(libkdegames:sv) locale(libkdegames:ta) locale(libkdegames:te) locale(libkdegames:th) locale(libkdegames:tr) locale(libkdegames:ug) locale(libkdegames:uk) locale(libkdegames:wa) locale(libkdegames:zh_CN) locale(libkdegames:zh_TW)"
RDEPENDS:${PN} += "libkdegames"

inherit rpm
