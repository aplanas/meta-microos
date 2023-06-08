SUMMARY = "Translations for package libKPim5Itinerary5"
DESCRIPTION = "Provides translations for the 'libKPim5Itinerary5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libKPim5Itinerary5-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7925aedc596a18efeaed0e2160ff782a2449083ed3366a7d1ea01b93849d4b3e1f2a56b1a1669b05d10f2adc6e5ff711c5d9cf3f9138da2765759e1b2d77c057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5Itinerary5-lang libKPim5Itinerary5-lang-all locale(libKPim5Itinerary5:ar) locale(libKPim5Itinerary5:ca) locale(libKPim5Itinerary5:ca@valencia) locale(libKPim5Itinerary5:cs) locale(libKPim5Itinerary5:da) locale(libKPim5Itinerary5:de) locale(libKPim5Itinerary5:en_GB) locale(libKPim5Itinerary5:es) locale(libKPim5Itinerary5:et) locale(libKPim5Itinerary5:eu) locale(libKPim5Itinerary5:fi) locale(libKPim5Itinerary5:fr) locale(libKPim5Itinerary5:gl) locale(libKPim5Itinerary5:ia) locale(libKPim5Itinerary5:it) locale(libKPim5Itinerary5:ja) locale(libKPim5Itinerary5:ka) locale(libKPim5Itinerary5:ko) locale(libKPim5Itinerary5:lt) locale(libKPim5Itinerary5:nl) locale(libKPim5Itinerary5:nn) locale(libKPim5Itinerary5:pl) locale(libKPim5Itinerary5:pt) locale(libKPim5Itinerary5:pt_BR) locale(libKPim5Itinerary5:ru) locale(libKPim5Itinerary5:sk) locale(libKPim5Itinerary5:sl) locale(libKPim5Itinerary5:sv) locale(libKPim5Itinerary5:tr) locale(libKPim5Itinerary5:uk) locale(libKPim5Itinerary5:zh_CN) locale(libKPim5Itinerary5:zh_TW)"
RDEPENDS:${PN} += "libKPim5Itinerary5"

inherit rpm
