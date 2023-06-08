SUMMARY = "Translations for package kcm_flatpak"
DESCRIPTION = "Provides translations for the 'kcm_flatpak' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kcm_flatpak-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "634ce466eb7ae334c63f4be6b32c51844d5698103b581638fd4b761c59820fb0166d86e123c87b8fd77dfa3f7ad6b9042688211e7b99718e96761c09feb4b5bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kcm_flatpak-lang kcm_flatpak-lang-all locale(kcm_flatpak:ar) locale(kcm_flatpak:ca) locale(kcm_flatpak:ca@valencia) locale(kcm_flatpak:cs) locale(kcm_flatpak:de) locale(kcm_flatpak:en_GB) locale(kcm_flatpak:es) locale(kcm_flatpak:eu) locale(kcm_flatpak:fi) locale(kcm_flatpak:fr) locale(kcm_flatpak:it) locale(kcm_flatpak:ka) locale(kcm_flatpak:nl) locale(kcm_flatpak:nn) locale(kcm_flatpak:pl) locale(kcm_flatpak:pt) locale(kcm_flatpak:pt_BR) locale(kcm_flatpak:ru) locale(kcm_flatpak:sk) locale(kcm_flatpak:sl) locale(kcm_flatpak:tr) locale(kcm_flatpak:uk) locale(kcm_flatpak:zh_CN) locale(kcm_flatpak:zh_TW)"
RDEPENDS:${PN} += "kcm_flatpak"

inherit rpm
