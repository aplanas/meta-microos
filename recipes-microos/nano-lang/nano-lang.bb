SUMMARY = "Translations for package nano"
DESCRIPTION = "Provides translations for the 'nano' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.2"

RPM_NAME = "nano-lang-7.2-1.3.noarch.rpm"
RPM_HASH = "c935479e0eaf4e20bdecf9520921fd7a6ad31a131907a04adb34df31f4dc20873cc46d996b06e13556d02845bd2f0b9d62946918621053163434c403a72ee102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nano:bg) locale(nano:ca) locale(nano:cs) locale(nano:da) locale(nano:de) locale(nano:eo) locale(nano:es) locale(nano:eu) locale(nano:fi) locale(nano:fr) locale(nano:ga) locale(nano:gl) locale(nano:hr) locale(nano:hu) locale(nano:id) locale(nano:is) locale(nano:it) locale(nano:ja) locale(nano:ka) locale(nano:ko) locale(nano:ms) locale(nano:nb) locale(nano:nl) locale(nano:pl) locale(nano:pt) locale(nano:pt_BR) locale(nano:ro) locale(nano:ru) locale(nano:sk) locale(nano:sl) locale(nano:sq) locale(nano:sr) locale(nano:sv) locale(nano:tr) locale(nano:uk) locale(nano:vi) locale(nano:zh_CN) locale(nano:zh_TW) nano-lang nano-lang-all"
RDEPENDS:${PN} += "nano"

inherit rpm
