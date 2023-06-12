SUMMARY = "Translations for package zim"
DESCRIPTION = "Provides translations for the 'zim' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.75.1"

RPM_NAME = "zim-lang-0.75.1-2.2.noarch.rpm"
RPM_HASH = "9896fe5a9c0e88375ec4022393955b9c5d5f3370cc753224288a83b57eb61dfde682448dbdb2d2d33de4e3e27069c641a26804e9a093b7325dc464e44c0c3384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(zim:ar) \
locale(zim:ca) \
locale(zim:cs) \
locale(zim:da) \
locale(zim:de) \
locale(zim:el) \
locale(zim:en_GB) \
locale(zim:es) \
locale(zim:et) \
locale(zim:eu) \
locale(zim:fi) \
locale(zim:fr) \
locale(zim:gl) \
locale(zim:he) \
locale(zim:hr) \
locale(zim:hu) \
locale(zim:id) \
locale(zim:it) \
locale(zim:ja) \
locale(zim:ko) \
locale(zim:nb) \
locale(zim:nl) \
locale(zim:pl) \
locale(zim:pt) \
locale(zim:pt_BR) \
locale(zim:ro) \
locale(zim:ru) \
locale(zim:si) \
locale(zim:sk) \
locale(zim:sl) \
locale(zim:sq) \
locale(zim:sr) \
locale(zim:sv) \
locale(zim:tr) \
locale(zim:uk) \
locale(zim:vi) \
locale(zim:zh_CN) \
locale(zim:zh_TW) \
zim-lang \
zim-lang-all"
RDEPENDS:${PN} += "zim"

inherit rpm
