SUMMARY = "Translations for package xfce4-power-manager"
DESCRIPTION = "Provides translations for the 'xfce4-power-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfce4-power-manager-lang-4.18.1-1.3.noarch.rpm"
RPM_HASH = "0be7a02a048ba73df9d25f313f13445adc422df1b5f34b20a4ce956278e41e7e5036cde6b3f55908c44a9fc52ad76d18398a114095344ab7920ac9ebadedcad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-power-manager:ar) locale(xfce4-power-manager:ast) locale(xfce4-power-manager:be) locale(xfce4-power-manager:bg) locale(xfce4-power-manager:ca) locale(xfce4-power-manager:cs) locale(xfce4-power-manager:da) locale(xfce4-power-manager:de) locale(xfce4-power-manager:el) locale(xfce4-power-manager:en_AU) locale(xfce4-power-manager:en_CA) locale(xfce4-power-manager:en_GB) locale(xfce4-power-manager:es) locale(xfce4-power-manager:et) locale(xfce4-power-manager:eu) locale(xfce4-power-manager:fi) locale(xfce4-power-manager:fr) locale(xfce4-power-manager:gl) locale(xfce4-power-manager:he) locale(xfce4-power-manager:hr) locale(xfce4-power-manager:hu) locale(xfce4-power-manager:id) locale(xfce4-power-manager:is) locale(xfce4-power-manager:it) locale(xfce4-power-manager:ja) locale(xfce4-power-manager:kk) locale(xfce4-power-manager:kn) locale(xfce4-power-manager:ko) locale(xfce4-power-manager:lt) locale(xfce4-power-manager:ms) locale(xfce4-power-manager:nb) locale(xfce4-power-manager:nl) locale(xfce4-power-manager:nn) locale(xfce4-power-manager:oc) locale(xfce4-power-manager:pa) locale(xfce4-power-manager:pl) locale(xfce4-power-manager:pt) locale(xfce4-power-manager:pt_BR) locale(xfce4-power-manager:ro) locale(xfce4-power-manager:ru) locale(xfce4-power-manager:si) locale(xfce4-power-manager:sk) locale(xfce4-power-manager:sl) locale(xfce4-power-manager:sq) locale(xfce4-power-manager:sr) locale(xfce4-power-manager:sv) locale(xfce4-power-manager:te) locale(xfce4-power-manager:th) locale(xfce4-power-manager:tr) locale(xfce4-power-manager:ug) locale(xfce4-power-manager:uk) locale(xfce4-power-manager:vi) locale(xfce4-power-manager:zh_CN) locale(xfce4-power-manager:zh_HK) locale(xfce4-power-manager:zh_TW) xfce4-power-manager-lang xfce4-power-manager-lang-all"
RDEPENDS:${PN} += "xfce4-power-manager"

inherit rpm
