SUMMARY = "Translations for package xfce4-screenshooter"
DESCRIPTION = "Provides translations for the 'xfce4-screenshooter' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.3"

RPM_NAME = "xfce4-screenshooter-lang-1.10.3-1.3.noarch.rpm"
RPM_HASH = "384e7b8d1bdae41174b570c489ac169f58cc4a9a6524d0f84b30f890cb043cf5d1bdbd21438b3a466e2da97223bca60e7971f003cd07722e0191c42bee1a5b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xfce4-screenshooter:ar) locale(xfce4-screenshooter:ast) locale(xfce4-screenshooter:be) locale(xfce4-screenshooter:bg) locale(xfce4-screenshooter:ca) locale(xfce4-screenshooter:cs) locale(xfce4-screenshooter:da) locale(xfce4-screenshooter:de) locale(xfce4-screenshooter:el) locale(xfce4-screenshooter:en_AU) locale(xfce4-screenshooter:en_GB) locale(xfce4-screenshooter:es) locale(xfce4-screenshooter:et) locale(xfce4-screenshooter:eu) locale(xfce4-screenshooter:fi) locale(xfce4-screenshooter:fr) locale(xfce4-screenshooter:gl) locale(xfce4-screenshooter:he) locale(xfce4-screenshooter:hr) locale(xfce4-screenshooter:hu) locale(xfce4-screenshooter:id) locale(xfce4-screenshooter:is) locale(xfce4-screenshooter:it) locale(xfce4-screenshooter:ja) locale(xfce4-screenshooter:ka) locale(xfce4-screenshooter:kk) locale(xfce4-screenshooter:ko) locale(xfce4-screenshooter:lt) locale(xfce4-screenshooter:lv) locale(xfce4-screenshooter:ms) locale(xfce4-screenshooter:nb) locale(xfce4-screenshooter:nl) locale(xfce4-screenshooter:nn) locale(xfce4-screenshooter:oc) locale(xfce4-screenshooter:pa) locale(xfce4-screenshooter:pl) locale(xfce4-screenshooter:pt) locale(xfce4-screenshooter:pt_BR) locale(xfce4-screenshooter:ro) locale(xfce4-screenshooter:ru) locale(xfce4-screenshooter:si) locale(xfce4-screenshooter:sk) locale(xfce4-screenshooter:sl) locale(xfce4-screenshooter:sq) locale(xfce4-screenshooter:sr) locale(xfce4-screenshooter:sv) locale(xfce4-screenshooter:te) locale(xfce4-screenshooter:th) locale(xfce4-screenshooter:tr) locale(xfce4-screenshooter:ug) locale(xfce4-screenshooter:uk) locale(xfce4-screenshooter:vi) locale(xfce4-screenshooter:zh_CN) locale(xfce4-screenshooter:zh_TW) xfce4-screenshooter-lang xfce4-screenshooter-lang-all"
RDEPENDS:${PN} += "xfce4-screenshooter"

inherit rpm
