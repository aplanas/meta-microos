SUMMARY = "Translations for package kalendar"
DESCRIPTION = "Provides translations for the 'kalendar' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "kalendar-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "69baac076e079fe863f694963f34bf850a2401d77c359d47b488a488cc731833ebcbe65ab6b0da664681d789ed24948331d59a3fda3c941ea1ffea1b25d510fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalendar-lang kalendar-lang-all locale(kalendar:ar) locale(kalendar:az) locale(kalendar:ca) locale(kalendar:ca@valencia) locale(kalendar:cs) locale(kalendar:de) locale(kalendar:el) locale(kalendar:en_GB) locale(kalendar:es) locale(kalendar:eu) locale(kalendar:fi) locale(kalendar:fr) locale(kalendar:hu) locale(kalendar:id) locale(kalendar:it) locale(kalendar:ja) locale(kalendar:ka) locale(kalendar:ko) locale(kalendar:lt) locale(kalendar:lv) locale(kalendar:nl) locale(kalendar:nn) locale(kalendar:pl) locale(kalendar:pt) locale(kalendar:pt_BR) locale(kalendar:ru) locale(kalendar:sk) locale(kalendar:sl) locale(kalendar:sv) locale(kalendar:ta) locale(kalendar:tr) locale(kalendar:uk) locale(kalendar:zh_CN) locale(kalendar:zh_TW)"
RDEPENDS:${PN} += "kalendar"

inherit rpm
