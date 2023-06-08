SUMMARY = "Translations for package itinerary"
DESCRIPTION = "Provides translations for the 'itinerary' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "itinerary-lang-23.04.0-2.1.noarch.rpm"
RPM_HASH = "a3c4b9bc1473f834c690d9b9f7382bc27ec9ae35ddd28d50e2320a04302f932f785024c50a4c5a3de5867595ab360346fa758ac653b7541fd4cf92eb680a78ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itinerary-lang itinerary-lang-all locale(itinerary:ca) locale(itinerary:ca@valencia) locale(itinerary:cs) locale(itinerary:de) locale(itinerary:en_GB) locale(itinerary:es) locale(itinerary:et) locale(itinerary:eu) locale(itinerary:fi) locale(itinerary:fr) locale(itinerary:gl) locale(itinerary:ia) locale(itinerary:it) locale(itinerary:ja) locale(itinerary:ka) locale(itinerary:ko) locale(itinerary:lt) locale(itinerary:nl) locale(itinerary:pl) locale(itinerary:pt) locale(itinerary:pt_BR) locale(itinerary:ru) locale(itinerary:sk) locale(itinerary:sl) locale(itinerary:sv) locale(itinerary:tr) locale(itinerary:uk) locale(itinerary:zh_CN) locale(itinerary:zh_TW)"
RDEPENDS:${PN} += "itinerary"

inherit rpm
