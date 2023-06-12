SUMMARY = "Translations for package kcm_tablet"
DESCRIPTION = "Provides translations for the 'kcm_tablet' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.0"

RPM_NAME = "kcm_tablet-lang-3.2.0-5.7.noarch.rpm"
RPM_HASH = "ac46c949ec374d58dfac34737ea5a699ea8a41a87746ea2861c7a15f5bd8134f3ff049c68b4e6d227a44fafdcb8b60495c6ff69d4c899f454cc702d9fa37e411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm_tablet-lang \
kcm_tablet-lang-all \
locale(kcm_tablet:ar) \
locale(kcm_tablet:ast) \
locale(kcm_tablet:bg) \
locale(kcm_tablet:bs) \
locale(kcm_tablet:ca) \
locale(kcm_tablet:ca@valencia) \
locale(kcm_tablet:cs) \
locale(kcm_tablet:da) \
locale(kcm_tablet:de) \
locale(kcm_tablet:el) \
locale(kcm_tablet:en_GB) \
locale(kcm_tablet:eo) \
locale(kcm_tablet:es) \
locale(kcm_tablet:et) \
locale(kcm_tablet:fi) \
locale(kcm_tablet:fr) \
locale(kcm_tablet:ga) \
locale(kcm_tablet:gl) \
locale(kcm_tablet:hu) \
locale(kcm_tablet:ia) \
locale(kcm_tablet:id) \
locale(kcm_tablet:it) \
locale(kcm_tablet:ja) \
locale(kcm_tablet:kk) \
locale(kcm_tablet:km) \
locale(kcm_tablet:ko) \
locale(kcm_tablet:lt) \
locale(kcm_tablet:mai) \
locale(kcm_tablet:mr) \
locale(kcm_tablet:nb) \
locale(kcm_tablet:nds) \
locale(kcm_tablet:nl) \
locale(kcm_tablet:nn) \
locale(kcm_tablet:pa) \
locale(kcm_tablet:pl) \
locale(kcm_tablet:pt) \
locale(kcm_tablet:pt_BR) \
locale(kcm_tablet:ro) \
locale(kcm_tablet:ru) \
locale(kcm_tablet:sk) \
locale(kcm_tablet:sl) \
locale(kcm_tablet:sv) \
locale(kcm_tablet:tr) \
locale(kcm_tablet:ug) \
locale(kcm_tablet:uk) \
locale(kcm_tablet:zh_CN) \
locale(kcm_tablet:zh_TW)"
RDEPENDS:${PN} += "kcm_tablet"

inherit rpm
