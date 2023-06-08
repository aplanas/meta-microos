SUMMARY = "Translations for package milou5"
DESCRIPTION = "Provides translations for the 'milou5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.27.4"

RPM_NAME = "milou5-lang-5.27.4-1.1.noarch.rpm"
RPM_HASH = "644dcee79aad6021b66f5e84b1806f28c3f48a38a2b546ea3ca554f2df4e5e29d54dc2167b4daf8743f7cdb90896d6cb0589a02d04f2f91d6184678a6ae31cfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(milou5:ar) locale(milou5:bg) locale(milou5:ca) locale(milou5:ca@valencia) locale(milou5:cs) locale(milou5:da) locale(milou5:de) locale(milou5:el) locale(milou5:en_GB) locale(milou5:es) locale(milou5:et) locale(milou5:eu) locale(milou5:fi) locale(milou5:fr) locale(milou5:gl) locale(milou5:he) locale(milou5:hi) locale(milou5:hu) locale(milou5:ia) locale(milou5:id) locale(milou5:it) locale(milou5:ka) locale(milou5:ko) locale(milou5:lt) locale(milou5:ml) locale(milou5:nl) locale(milou5:nn) locale(milou5:pl) locale(milou5:pt) locale(milou5:pt_BR) locale(milou5:ru) locale(milou5:sk) locale(milou5:sl) locale(milou5:sr) locale(milou5:sr@ijekavian) locale(milou5:sr@ijekavianlatin) locale(milou5:sr@latin) locale(milou5:sv) locale(milou5:tr) locale(milou5:uk) locale(milou5:zh_CN) locale(milou5:zh_TW) milou5-lang milou5-lang-all"
RDEPENDS:${PN} += "milou5"

inherit rpm
