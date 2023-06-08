SUMMARY = "Translations for package libkdegames"
DESCRIPTION = "Provides translations for the 'libkdegames' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkdegames-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "1df6108df06b913ee96160e150f0d04febb324c8e6d2efb00d5d6f80edb479fd4d8960227db8b1112dfeb09b64b3f983d9067e132fa209d64216aa4fb53d9d06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkdegames-lang libkdegames-lang-all locale(libkdegames:af) locale(libkdegames:ar) locale(libkdegames:be) locale(libkdegames:bg) locale(libkdegames:bn) locale(libkdegames:br) locale(libkdegames:bs) locale(libkdegames:ca) locale(libkdegames:ca@valencia) locale(libkdegames:cs) locale(libkdegames:cy) locale(libkdegames:da) locale(libkdegames:de) locale(libkdegames:el) locale(libkdegames:en_GB) locale(libkdegames:eo) locale(libkdegames:es) locale(libkdegames:et) locale(libkdegames:eu) locale(libkdegames:fa) locale(libkdegames:fi) locale(libkdegames:fr) locale(libkdegames:ga) locale(libkdegames:gl) locale(libkdegames:he) locale(libkdegames:hi) locale(libkdegames:hr) locale(libkdegames:hu) locale(libkdegames:id) locale(libkdegames:is) locale(libkdegames:it) locale(libkdegames:ja) locale(libkdegames:ka) locale(libkdegames:kk) locale(libkdegames:km) locale(libkdegames:ko) locale(libkdegames:lt) locale(libkdegames:lv) locale(libkdegames:mai) locale(libkdegames:mk) locale(libkdegames:ml) locale(libkdegames:mr) locale(libkdegames:nb) locale(libkdegames:nds) locale(libkdegames:ne) locale(libkdegames:nl) locale(libkdegames:nn) locale(libkdegames:oc) locale(libkdegames:pa) locale(libkdegames:pl) locale(libkdegames:pt) locale(libkdegames:pt_BR) locale(libkdegames:ro) locale(libkdegames:ru) locale(libkdegames:sk) locale(libkdegames:sl) locale(libkdegames:sq) locale(libkdegames:sr) locale(libkdegames:sr@ijekavian) locale(libkdegames:sr@ijekavianlatin) locale(libkdegames:sr@latin) locale(libkdegames:sv) locale(libkdegames:ta) locale(libkdegames:te) locale(libkdegames:th) locale(libkdegames:tr) locale(libkdegames:ug) locale(libkdegames:uk) locale(libkdegames:wa) locale(libkdegames:zh_CN) locale(libkdegames:zh_TW)"
RDEPENDS:${PN} += "libkdegames"

inherit rpm
