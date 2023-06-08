SUMMARY = "Translations for package kde-inotify-survey"
DESCRIPTION = "Provides translations for the 'kde-inotify-survey' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kde-inotify-survey-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "33fe7d5c558b4bab1069c0c80b7286ddd171cdd5c3722ab6643c74be1d85ecdde94f679c2a2cd67698d3c9b5878dab32a007f20b1582e59d06e75ac79ab9a3f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-inotify-survey-lang kde-inotify-survey-lang-all locale(kde-inotify-survey:ca) locale(kde-inotify-survey:ca@valencia) locale(kde-inotify-survey:cs) locale(kde-inotify-survey:de) locale(kde-inotify-survey:en_GB) locale(kde-inotify-survey:es) locale(kde-inotify-survey:eu) locale(kde-inotify-survey:fr) locale(kde-inotify-survey:it) locale(kde-inotify-survey:ja) locale(kde-inotify-survey:ka) locale(kde-inotify-survey:ko) locale(kde-inotify-survey:lt) locale(kde-inotify-survey:nl) locale(kde-inotify-survey:pl) locale(kde-inotify-survey:pt) locale(kde-inotify-survey:sk) locale(kde-inotify-survey:sl) locale(kde-inotify-survey:sv) locale(kde-inotify-survey:tr) locale(kde-inotify-survey:uk) locale(kde-inotify-survey:zh_CN) locale(kde-inotify-survey:zh_TW)"
RDEPENDS:${PN} += "kde-inotify-survey"

inherit rpm
