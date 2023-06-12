SUMMARY = "Translations for package icewm"
DESCRIPTION = "Provides translations for the 'icewm' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "icewm-lang-3.3.5-1.1.noarch.rpm"
RPM_HASH = "b5205d8560d330c83e3dccf0cd62a826172bb614631f82fc954f553db5cce01e2d82b441db819766977c0c0bf90777ec6f45b6e63c5b7e8232cdee01929753bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icewm-lang icewm-lang-all locale(icewm:ar) locale(icewm:be) locale(icewm:bg) locale(icewm:ca) locale(icewm:cs) locale(icewm:da) locale(icewm:de) locale(icewm:el) locale(icewm:en) locale(icewm:es) locale(icewm:fi) locale(icewm:fr) locale(icewm:he) locale(icewm:hr) locale(icewm:hu) locale(icewm:id) locale(icewm:it) locale(icewm:ja) locale(icewm:ko) locale(icewm:lt) locale(icewm:lv) locale(icewm:mk) locale(icewm:nb) locale(icewm:nl) locale(icewm:pl) locale(icewm:pt) locale(icewm:pt_BR) locale(icewm:ro) locale(icewm:ru) locale(icewm:sk) locale(icewm:sl) locale(icewm:sv) locale(icewm:tr) locale(icewm:uk) locale(icewm:vi) locale(icewm:zh_CN) locale(icewm:zh_TW)"
RDEPENDS:${PN} += "icewm"

inherit rpm
