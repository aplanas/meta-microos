SUMMARY = "Translations for package newsboat"
DESCRIPTION = "Provides translations for the 'newsboat' package."
LICENSE = "MIT"

PV = "2.31"

RPM_NAME = "newsboat-lang-2.31-1.1.noarch.rpm"
RPM_HASH = "49e5888f6b1b4b1bf999c4cf044620d88aa21556b26011fbfa9f62f8dec809393afceee25b3accb0d35a67bc127f006b8459013be18c9e968399ba9a71471580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(newsboat:ca) locale(newsboat:de) locale(newsboat:es) locale(newsboat:fr) locale(newsboat:hu) locale(newsboat:it) locale(newsboat:ja) locale(newsboat:nb) locale(newsboat:nl) locale(newsboat:pl) locale(newsboat:pt_BR) locale(newsboat:ru) locale(newsboat:sk) locale(newsboat:sv) locale(newsboat:tr) locale(newsboat:uk) locale(newsboat:zh_TW) newsboat-lang newsboat-lang-all"
RDEPENDS:${PN} += "newsboat"

inherit rpm
