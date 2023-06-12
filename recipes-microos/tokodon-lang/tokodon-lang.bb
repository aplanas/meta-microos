SUMMARY = "Translations for package tokodon"
DESCRIPTION = "Provides translations for the 'tokodon' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "tokodon-lang-23.04.1-2.1.noarch.rpm"
RPM_HASH = "079fead14f8a7510382841cc79e51aa685b8519a0f31d6b19c5bc20d5bcb0e5249164a6d5242db7f1b59f1cd8e0f26466728806d191fe7ae041203cfc31100eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tokodon:ca) \
locale(tokodon:ca@valencia) \
locale(tokodon:cs) \
locale(tokodon:de) \
locale(tokodon:en_GB) \
locale(tokodon:es) \
locale(tokodon:eu) \
locale(tokodon:fi) \
locale(tokodon:fr) \
locale(tokodon:gl) \
locale(tokodon:hu) \
locale(tokodon:id) \
locale(tokodon:is) \
locale(tokodon:it) \
locale(tokodon:ja) \
locale(tokodon:ka) \
locale(tokodon:ko) \
locale(tokodon:lt) \
locale(tokodon:nl) \
locale(tokodon:pl) \
locale(tokodon:pt) \
locale(tokodon:pt_BR) \
locale(tokodon:sk) \
locale(tokodon:sl) \
locale(tokodon:sv) \
locale(tokodon:tr) \
locale(tokodon:uk) \
locale(tokodon:zh_CN) \
locale(tokodon:zh_TW) \
tokodon-lang \
tokodon-lang-all"
RDEPENDS:${PN} += "tokodon"

inherit rpm
