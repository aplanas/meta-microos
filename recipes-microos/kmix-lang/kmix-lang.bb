SUMMARY = "Translations for package kmix"
DESCRIPTION = "Provides translations for the 'kmix' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kmix-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "3082b288fddaba1934f5898ee36e5f1b3027ecfc1214f89ee5e843014c6502843b825b155b28667f0b9b4fcdaea5fd89eb337c818def425cea8027cec50ebdbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmix-lang kmix-lang-all locale(kmix:af) locale(kmix:ar) locale(kmix:be) locale(kmix:bg) locale(kmix:br) locale(kmix:bs) locale(kmix:ca) locale(kmix:ca@valencia) locale(kmix:cs) locale(kmix:cy) locale(kmix:da) locale(kmix:de) locale(kmix:el) locale(kmix:en_GB) locale(kmix:eo) locale(kmix:es) locale(kmix:et) locale(kmix:eu) locale(kmix:fa) locale(kmix:fi) locale(kmix:fr) locale(kmix:ga) locale(kmix:gl) locale(kmix:he) locale(kmix:hi) locale(kmix:hr) locale(kmix:hu) locale(kmix:ia) locale(kmix:id) locale(kmix:is) locale(kmix:it) locale(kmix:ja) locale(kmix:ka) locale(kmix:kk) locale(kmix:km) locale(kmix:ko) locale(kmix:lt) locale(kmix:lv) locale(kmix:mk) locale(kmix:mr) locale(kmix:ms) locale(kmix:nb) locale(kmix:nds) locale(kmix:ne) locale(kmix:nl) locale(kmix:nn) locale(kmix:oc) locale(kmix:pa) locale(kmix:pl) locale(kmix:pt) locale(kmix:pt_BR) locale(kmix:ro) locale(kmix:ru) locale(kmix:sk) locale(kmix:sl) locale(kmix:sq) locale(kmix:sr) locale(kmix:sr@ijekavian) locale(kmix:sr@ijekavianlatin) locale(kmix:sr@latin) locale(kmix:sv) locale(kmix:ta) locale(kmix:th) locale(kmix:tr) locale(kmix:ug) locale(kmix:uk) locale(kmix:zh_CN) locale(kmix:zh_HK) locale(kmix:zh_TW)"
RDEPENDS:${PN} += "kmix"

inherit rpm
