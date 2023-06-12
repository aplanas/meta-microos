SUMMARY = "Translations for package kipi-plugins"
DESCRIPTION = "Provides translations for the 'kipi-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kipi-plugins-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "d85fdc1f97892f1d56245ec0c2b788984dab5e2715b2a9824410e4e9f3f22269552c7f9394bade870907cab9a0d335a719245f68871e149b818497821efeeb3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kipi-plugins-lang kipi-plugins-lang-all locale(kipi-plugins:ar) locale(kipi-plugins:be) locale(kipi-plugins:bg) locale(kipi-plugins:bs) locale(kipi-plugins:ca) locale(kipi-plugins:ca@valencia) locale(kipi-plugins:cs) locale(kipi-plugins:da) locale(kipi-plugins:de) locale(kipi-plugins:el) locale(kipi-plugins:en_GB) locale(kipi-plugins:eo) locale(kipi-plugins:es) locale(kipi-plugins:et) locale(kipi-plugins:eu) locale(kipi-plugins:fi) locale(kipi-plugins:fr) locale(kipi-plugins:ga) locale(kipi-plugins:gl) locale(kipi-plugins:hi) locale(kipi-plugins:hr) locale(kipi-plugins:hu) locale(kipi-plugins:ia) locale(kipi-plugins:id) locale(kipi-plugins:is) locale(kipi-plugins:it) locale(kipi-plugins:ja) locale(kipi-plugins:ka) locale(kipi-plugins:km) locale(kipi-plugins:ko) locale(kipi-plugins:lt) locale(kipi-plugins:lv) locale(kipi-plugins:mai) locale(kipi-plugins:ml) locale(kipi-plugins:mr) locale(kipi-plugins:ms) locale(kipi-plugins:nb) locale(kipi-plugins:nds) locale(kipi-plugins:nl) locale(kipi-plugins:nn) locale(kipi-plugins:oc) locale(kipi-plugins:pa) locale(kipi-plugins:pl) locale(kipi-plugins:pt) locale(kipi-plugins:pt_BR) locale(kipi-plugins:ro) locale(kipi-plugins:ru) locale(kipi-plugins:sk) locale(kipi-plugins:sl) locale(kipi-plugins:sq) locale(kipi-plugins:sv) locale(kipi-plugins:th) locale(kipi-plugins:tr) locale(kipi-plugins:ug) locale(kipi-plugins:uk) locale(kipi-plugins:zh_CN) locale(kipi-plugins:zh_TW)"
RDEPENDS:${PN} += "kipi-plugins"

inherit rpm
