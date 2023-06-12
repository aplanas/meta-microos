SUMMARY = "Translations for package wget"
DESCRIPTION = "Provides translations for the 'wget' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.21.4"

RPM_NAME = "wget-lang-1.21.4-1.1.noarch.rpm"
RPM_HASH = "4f3b44a4b742690a2cb71880eb55d143e0976b1e9a777a92db053937c9f47e08ebcac2c1457f1aa7406930f3b1dcfe29101c90464518fe6ed83ac130c900f9db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(wget:af) \
locale(wget:be) \
locale(wget:bg) \
locale(wget:ca) \
locale(wget:cs) \
locale(wget:da) \
locale(wget:de) \
locale(wget:el) \
locale(wget:en_GB) \
locale(wget:eo) \
locale(wget:es) \
locale(wget:et) \
locale(wget:eu) \
locale(wget:fi) \
locale(wget:fr) \
locale(wget:ga) \
locale(wget:gl) \
locale(wget:he) \
locale(wget:hr) \
locale(wget:hu) \
locale(wget:id) \
locale(wget:it) \
locale(wget:ja) \
locale(wget:ka) \
locale(wget:ko) \
locale(wget:lt) \
locale(wget:ms) \
locale(wget:nb) \
locale(wget:nl) \
locale(wget:pl) \
locale(wget:pt) \
locale(wget:pt_BR) \
locale(wget:ro) \
locale(wget:ru) \
locale(wget:sk) \
locale(wget:sl) \
locale(wget:sr) \
locale(wget:sv) \
locale(wget:tr) \
locale(wget:uk) \
locale(wget:vi) \
locale(wget:zh_CN) \
locale(wget:zh_TW) \
wget-lang \
wget-lang-all"
RDEPENDS:${PN} += "wget"

inherit rpm
