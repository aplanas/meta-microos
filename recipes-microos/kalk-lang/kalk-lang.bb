SUMMARY = "Translations for package kalk"
DESCRIPTION = "Provides translations for the 'kalk' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalk-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "3175288e243ca5fd7df846982037e2575e00a9c66615cbaeea17963ce771ffa162676e53ce50ae1459aad791236d9dbfbded2ce73b29baca89f86e7abed96730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalk-lang \
kalk-lang-all \
locale(kalk:ar) \
locale(kalk:az) \
locale(kalk:ca) \
locale(kalk:ca@valencia) \
locale(kalk:cs) \
locale(kalk:de) \
locale(kalk:el) \
locale(kalk:en_GB) \
locale(kalk:es) \
locale(kalk:eu) \
locale(kalk:fi) \
locale(kalk:fr) \
locale(kalk:gl) \
locale(kalk:hi) \
locale(kalk:hu) \
locale(kalk:it) \
locale(kalk:ja) \
locale(kalk:ka) \
locale(kalk:ko) \
locale(kalk:lt) \
locale(kalk:nl) \
locale(kalk:nn) \
locale(kalk:pa) \
locale(kalk:pl) \
locale(kalk:pt) \
locale(kalk:pt_BR) \
locale(kalk:ru) \
locale(kalk:sk) \
locale(kalk:sl) \
locale(kalk:sv) \
locale(kalk:tr) \
locale(kalk:uk) \
locale(kalk:zh_CN) \
locale(kalk:zh_TW)"
RDEPENDS:${PN} += "kalk"

inherit rpm
