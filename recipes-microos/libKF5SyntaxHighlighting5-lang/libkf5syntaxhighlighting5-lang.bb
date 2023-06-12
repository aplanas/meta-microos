SUMMARY = "Translations for package libKF5SyntaxHighlighting5"
DESCRIPTION = "Provides translations for the 'libKF5SyntaxHighlighting5' package."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-only & GPL-2.0-or-later & GPL-3.0-only & MIT & BSD-3-Clause & Artistic-1.0"

PV = "5.106.0"

RPM_NAME = "libKF5SyntaxHighlighting5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "1fbdedce17ab92dfc12b6733b58e2a9b94989add1972f1819b451d7cfa11d34ca13627163894eb3e21530270fe44b4043f767f9e09f617ed3bbbe65da06c042e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5SyntaxHighlighting5-lang \
libKF5SyntaxHighlighting5-lang-all \
locale(libKF5SyntaxHighlighting5:af) \
locale(libKF5SyntaxHighlighting5:ar) \
locale(libKF5SyntaxHighlighting5:az) \
locale(libKF5SyntaxHighlighting5:be) \
locale(libKF5SyntaxHighlighting5:bg) \
locale(libKF5SyntaxHighlighting5:bn) \
locale(libKF5SyntaxHighlighting5:br) \
locale(libKF5SyntaxHighlighting5:bs) \
locale(libKF5SyntaxHighlighting5:ca) \
locale(libKF5SyntaxHighlighting5:ca@valencia) \
locale(libKF5SyntaxHighlighting5:cs) \
locale(libKF5SyntaxHighlighting5:cy) \
locale(libKF5SyntaxHighlighting5:da) \
locale(libKF5SyntaxHighlighting5:de) \
locale(libKF5SyntaxHighlighting5:el) \
locale(libKF5SyntaxHighlighting5:en_GB) \
locale(libKF5SyntaxHighlighting5:eo) \
locale(libKF5SyntaxHighlighting5:es) \
locale(libKF5SyntaxHighlighting5:et) \
locale(libKF5SyntaxHighlighting5:eu) \
locale(libKF5SyntaxHighlighting5:fa) \
locale(libKF5SyntaxHighlighting5:fi) \
locale(libKF5SyntaxHighlighting5:fr) \
locale(libKF5SyntaxHighlighting5:ga) \
locale(libKF5SyntaxHighlighting5:gl) \
locale(libKF5SyntaxHighlighting5:gu) \
locale(libKF5SyntaxHighlighting5:he) \
locale(libKF5SyntaxHighlighting5:hi) \
locale(libKF5SyntaxHighlighting5:hr) \
locale(libKF5SyntaxHighlighting5:hu) \
locale(libKF5SyntaxHighlighting5:ia) \
locale(libKF5SyntaxHighlighting5:id) \
locale(libKF5SyntaxHighlighting5:is) \
locale(libKF5SyntaxHighlighting5:it) \
locale(libKF5SyntaxHighlighting5:ja) \
locale(libKF5SyntaxHighlighting5:ka) \
locale(libKF5SyntaxHighlighting5:kk) \
locale(libKF5SyntaxHighlighting5:km) \
locale(libKF5SyntaxHighlighting5:ko) \
locale(libKF5SyntaxHighlighting5:lt) \
locale(libKF5SyntaxHighlighting5:lv) \
locale(libKF5SyntaxHighlighting5:mai) \
locale(libKF5SyntaxHighlighting5:mk) \
locale(libKF5SyntaxHighlighting5:ml) \
locale(libKF5SyntaxHighlighting5:mr) \
locale(libKF5SyntaxHighlighting5:ms) \
locale(libKF5SyntaxHighlighting5:nb) \
locale(libKF5SyntaxHighlighting5:nds) \
locale(libKF5SyntaxHighlighting5:ne) \
locale(libKF5SyntaxHighlighting5:nl) \
locale(libKF5SyntaxHighlighting5:nn) \
locale(libKF5SyntaxHighlighting5:oc) \
locale(libKF5SyntaxHighlighting5:pa) \
locale(libKF5SyntaxHighlighting5:pl) \
locale(libKF5SyntaxHighlighting5:pt) \
locale(libKF5SyntaxHighlighting5:pt_BR) \
locale(libKF5SyntaxHighlighting5:ro) \
locale(libKF5SyntaxHighlighting5:ru) \
locale(libKF5SyntaxHighlighting5:si) \
locale(libKF5SyntaxHighlighting5:sk) \
locale(libKF5SyntaxHighlighting5:sl) \
locale(libKF5SyntaxHighlighting5:sq) \
locale(libKF5SyntaxHighlighting5:sr) \
locale(libKF5SyntaxHighlighting5:sr@ijekavian) \
locale(libKF5SyntaxHighlighting5:sr@ijekavianlatin) \
locale(libKF5SyntaxHighlighting5:sr@latin) \
locale(libKF5SyntaxHighlighting5:sv) \
locale(libKF5SyntaxHighlighting5:ta) \
locale(libKF5SyntaxHighlighting5:th) \
locale(libKF5SyntaxHighlighting5:tr) \
locale(libKF5SyntaxHighlighting5:ug) \
locale(libKF5SyntaxHighlighting5:uk) \
locale(libKF5SyntaxHighlighting5:vi) \
locale(libKF5SyntaxHighlighting5:wa) \
locale(libKF5SyntaxHighlighting5:zh_CN) \
locale(libKF5SyntaxHighlighting5:zh_TW)"
RDEPENDS:${PN} += "libKF5SyntaxHighlighting5"

inherit rpm
