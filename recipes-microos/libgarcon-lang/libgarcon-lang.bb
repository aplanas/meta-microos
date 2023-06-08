SUMMARY = "Languages for package libgarcon"
DESCRIPTION = "Provides translations to the package libgarcon"
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.18.1"

RPM_NAME = "libgarcon-lang-4.18.1-2.1.noarch.rpm"
RPM_HASH = "deb263ab571c11235b7a81059f3920cd48e23dcf66719fd5dfaf68a8a721315dc5e094149d59bc7b61f03ca009dde8cf64876b911bb45ea73447bdf7d74d1490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgarcon-lang libgarcon-lang-all locale(libgarcon:ar) locale(libgarcon:be) locale(libgarcon:bg) locale(libgarcon:bn) locale(libgarcon:ca) locale(libgarcon:cs) locale(libgarcon:cy) locale(libgarcon:da) locale(libgarcon:de) locale(libgarcon:el) locale(libgarcon:en_AU) locale(libgarcon:en_GB) locale(libgarcon:eo) locale(libgarcon:es) locale(libgarcon:et) locale(libgarcon:eu) locale(libgarcon:fi) locale(libgarcon:fr) locale(libgarcon:gl) locale(libgarcon:he) locale(libgarcon:hi) locale(libgarcon:hr) locale(libgarcon:hu) locale(libgarcon:id) locale(libgarcon:is) locale(libgarcon:it) locale(libgarcon:ja) locale(libgarcon:ka) locale(libgarcon:ko) locale(libgarcon:lt) locale(libgarcon:lv) locale(libgarcon:ms) locale(libgarcon:nb) locale(libgarcon:nl) locale(libgarcon:nn) locale(libgarcon:oc) locale(libgarcon:pa) locale(libgarcon:pl) locale(libgarcon:pt) locale(libgarcon:pt_BR) locale(libgarcon:ro) locale(libgarcon:ru) locale(libgarcon:sk) locale(libgarcon:sl) locale(libgarcon:sq) locale(libgarcon:sr) locale(libgarcon:sv) locale(libgarcon:te) locale(libgarcon:th) locale(libgarcon:tr) locale(libgarcon:ug) locale(libgarcon:uk) locale(libgarcon:zh_CN) locale(libgarcon:zh_HK) locale(libgarcon:zh_TW)"
RDEPENDS:${PN} += "libgarcon-data"

inherit rpm
