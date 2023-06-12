SUMMARY = "Translations for package libpurple"
DESCRIPTION = "Provides translations for the 'libpurple' package."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-lang-2.14.12-1.3.noarch.rpm"
RPM_HASH = "ec9e6c8e6c42323d86717e11afab3f08626ccf6ef4ddacfa498c8756782c0e3940bdd0371f6d336cf53b97724f048ec7d03c78faa78d65b716d13660d1f7805a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libpurple-lang \
libpurple-lang-all \
locale(libpurple:af) \
locale(libpurple:ar) \
locale(libpurple:as) \
locale(libpurple:ast) \
locale(libpurple:az) \
locale(libpurple:be@latin) \
locale(libpurple:bg) \
locale(libpurple:bn) \
locale(libpurple:bn_IN) \
locale(libpurple:br) \
locale(libpurple:bs) \
locale(libpurple:ca) \
locale(libpurple:ca@valencia) \
locale(libpurple:cs) \
locale(libpurple:da) \
locale(libpurple:de) \
locale(libpurple:dz) \
locale(libpurple:el) \
locale(libpurple:en_AU) \
locale(libpurple:en_CA) \
locale(libpurple:en_GB) \
locale(libpurple:eo) \
locale(libpurple:es) \
locale(libpurple:es_AR) \
locale(libpurple:et) \
locale(libpurple:eu) \
locale(libpurple:fa) \
locale(libpurple:fi) \
locale(libpurple:fr) \
locale(libpurple:ga) \
locale(libpurple:gl) \
locale(libpurple:gu) \
locale(libpurple:he) \
locale(libpurple:hi) \
locale(libpurple:hr) \
locale(libpurple:hu) \
locale(libpurple:id) \
locale(libpurple:it) \
locale(libpurple:ja) \
locale(libpurple:ka) \
locale(libpurple:kk) \
locale(libpurple:km) \
locale(libpurple:kn) \
locale(libpurple:ko) \
locale(libpurple:lt) \
locale(libpurple:lv) \
locale(libpurple:mai) \
locale(libpurple:mk) \
locale(libpurple:ml) \
locale(libpurple:mr) \
locale(libpurple:nb) \
locale(libpurple:ne) \
locale(libpurple:nl) \
locale(libpurple:nn) \
locale(libpurple:oc) \
locale(libpurple:or) \
locale(libpurple:pa) \
locale(libpurple:pl) \
locale(libpurple:pt) \
locale(libpurple:pt_BR) \
locale(libpurple:ro) \
locale(libpurple:ru) \
locale(libpurple:si) \
locale(libpurple:sk) \
locale(libpurple:sl) \
locale(libpurple:sq) \
locale(libpurple:sr) \
locale(libpurple:sr@latin) \
locale(libpurple:sv) \
locale(libpurple:ta) \
locale(libpurple:te) \
locale(libpurple:th) \
locale(libpurple:tr) \
locale(libpurple:uk) \
locale(libpurple:vi) \
locale(libpurple:zh_CN) \
locale(libpurple:zh_HK) \
locale(libpurple:zh_TW)"
RDEPENDS:${PN} += "libpurple"

inherit rpm
