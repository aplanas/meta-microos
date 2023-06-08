SUMMARY = "Translations for package ghostwriter"
DESCRIPTION = "Provides translations for the 'ghostwriter' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "ghostwriter-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "a12b1b6db5b1c8f4c2d17eaeab5dd068d0b6323afd558ce1636f7652aa5e24102f225ae4db925436a7cae0f4de017f54cf015074bdce7c180869f57305d63b25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ghostwriter-lang ghostwriter-lang-all locale(ghostwriter:ca) locale(ghostwriter:ca@valencia) locale(ghostwriter:cs) locale(ghostwriter:de) locale(ghostwriter:en) locale(ghostwriter:en_GB) locale(ghostwriter:es) locale(ghostwriter:eu) locale(ghostwriter:fi) locale(ghostwriter:fr) locale(ghostwriter:id) locale(ghostwriter:it) locale(ghostwriter:ja) locale(ghostwriter:ka) locale(ghostwriter:lt) locale(ghostwriter:nl) locale(ghostwriter:pl) locale(ghostwriter:pt) locale(ghostwriter:ru) locale(ghostwriter:sk) locale(ghostwriter:sl) locale(ghostwriter:tr) locale(ghostwriter:uk) locale(ghostwriter:zh_CN) locale(ghostwriter:zh_TW)"
RDEPENDS:${PN} += "ghostwriter"

inherit rpm
