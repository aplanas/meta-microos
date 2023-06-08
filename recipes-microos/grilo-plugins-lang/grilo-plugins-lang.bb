SUMMARY = "Translations for package grilo-plugins"
DESCRIPTION = "Provides translations for the 'grilo-plugins' package."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "grilo-plugins-lang-0.3.16-1.1.noarch.rpm"
RPM_HASH = "f6f17d109826e27455464f8e3372b87a465364b5c8f0112eb64ab00311cd2db18e32c38e5fa14da3f438b0cccccf0ef153aa222f315d28058ca347293d21706e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grilo-plugins-lang grilo-plugins-lang-all locale(grilo-plugins:as) locale(grilo-plugins:be) locale(grilo-plugins:bg) locale(grilo-plugins:bs) locale(grilo-plugins:ca) locale(grilo-plugins:ca@valencia) locale(grilo-plugins:cs) locale(grilo-plugins:da) locale(grilo-plugins:de) locale(grilo-plugins:el) locale(grilo-plugins:en_GB) locale(grilo-plugins:eo) locale(grilo-plugins:es) locale(grilo-plugins:eu) locale(grilo-plugins:fi) locale(grilo-plugins:fr) locale(grilo-plugins:fur) locale(grilo-plugins:gl) locale(grilo-plugins:he) locale(grilo-plugins:hr) locale(grilo-plugins:hu) locale(grilo-plugins:id) locale(grilo-plugins:it) locale(grilo-plugins:ja) locale(grilo-plugins:ka) locale(grilo-plugins:ko) locale(grilo-plugins:lt) locale(grilo-plugins:lv) locale(grilo-plugins:ml) locale(grilo-plugins:ms) locale(grilo-plugins:nb) locale(grilo-plugins:ne) locale(grilo-plugins:nl) locale(grilo-plugins:oc) locale(grilo-plugins:pa) locale(grilo-plugins:pl) locale(grilo-plugins:pt) locale(grilo-plugins:pt_BR) locale(grilo-plugins:ro) locale(grilo-plugins:ru) locale(grilo-plugins:sk) locale(grilo-plugins:sl) locale(grilo-plugins:sr) locale(grilo-plugins:sr@latin) locale(grilo-plugins:sv) locale(grilo-plugins:tr) locale(grilo-plugins:uk) locale(grilo-plugins:zh_CN) locale(grilo-plugins:zh_HK) locale(grilo-plugins:zh_TW)"
RDEPENDS:${PN} += "grilo-plugins"

inherit rpm
