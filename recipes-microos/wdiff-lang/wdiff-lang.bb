SUMMARY = "Translations for package wdiff"
DESCRIPTION = "Provides translations for the 'wdiff' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "wdiff-lang-1.2.2-8.7.noarch.rpm"
RPM_HASH = "4758aa37c78b7469ef7007993b3f9b4900bf478c736f276d3e58afd6b7948812d82f4ad011696948236bc9cb53e036a470a1e9de8e950154108e29860f9df0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wdiff:af) \
locale(wdiff:be) \
locale(wdiff:bg) \
locale(wdiff:ca) \
locale(wdiff:cs) \
locale(wdiff:da) \
locale(wdiff:de) \
locale(wdiff:el) \
locale(wdiff:en@boldquot) \
locale(wdiff:en@quot) \
locale(wdiff:en_GB) \
locale(wdiff:eo) \
locale(wdiff:es) \
locale(wdiff:et) \
locale(wdiff:eu) \
locale(wdiff:fi) \
locale(wdiff:fr) \
locale(wdiff:ga) \
locale(wdiff:gl) \
locale(wdiff:hu) \
locale(wdiff:id) \
locale(wdiff:it) \
locale(wdiff:ja) \
locale(wdiff:ko) \
locale(wdiff:ms) \
locale(wdiff:nb) \
locale(wdiff:nl) \
locale(wdiff:pl) \
locale(wdiff:pt) \
locale(wdiff:pt_BR) \
locale(wdiff:ro) \
locale(wdiff:ru) \
locale(wdiff:sk) \
locale(wdiff:sl) \
locale(wdiff:sr) \
locale(wdiff:sv) \
locale(wdiff:tr) \
locale(wdiff:uk) \
locale(wdiff:vi) \
locale(wdiff:zh_CN) \
locale(wdiff:zh_TW) \
wdiff-lang \
wdiff-lang-all"
RDEPENDS:${PN} += "wdiff"

inherit rpm
