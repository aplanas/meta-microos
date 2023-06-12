SUMMARY = "Translations for package plasma5-mobile"
DESCRIPTION = "Provides translations for the 'plasma5-mobile' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "plasma5-mobile-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "ce66d191ad4086e09030be1e5914be68525c8d6d4f54e4527c8c1c3bd6ca83a312b898a2916c9beb417d496fdf3dfe0a692d22afa958209a3ad56c16ebb43269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-mobile:az) locale(plasma5-mobile:ca) locale(plasma5-mobile:ca@valencia) locale(plasma5-mobile:cs) locale(plasma5-mobile:de) locale(plasma5-mobile:en_GB) locale(plasma5-mobile:es) locale(plasma5-mobile:eu) locale(plasma5-mobile:fi) locale(plasma5-mobile:fr) locale(plasma5-mobile:gl) locale(plasma5-mobile:ia) locale(plasma5-mobile:id) locale(plasma5-mobile:is) locale(plasma5-mobile:it) locale(plasma5-mobile:ja) locale(plasma5-mobile:ka) locale(plasma5-mobile:ko) locale(plasma5-mobile:nl) locale(plasma5-mobile:nn) locale(plasma5-mobile:pa) locale(plasma5-mobile:pl) locale(plasma5-mobile:pt) locale(plasma5-mobile:pt_BR) locale(plasma5-mobile:ro) locale(plasma5-mobile:ru) locale(plasma5-mobile:sk) locale(plasma5-mobile:sl) locale(plasma5-mobile:sv) locale(plasma5-mobile:tr) locale(plasma5-mobile:uk) locale(plasma5-mobile:zh_CN) locale(plasma5-mobile:zh_TW) plasma5-mobile-lang plasma5-mobile-lang-all"
RDEPENDS:${PN} += "plasma5-mobile"

inherit rpm
