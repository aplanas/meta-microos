SUMMARY = "Translations for package konsole"
DESCRIPTION = "Provides translations for the 'konsole-part' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "konsole-part-lang-23.04.1-1.2.noarch.rpm"
RPM_HASH = "323d476cc17014a3b335a73e4be82b966c574204ea15526da5091cd4bf803c56eb425bfdc15058507b3924eed281b4f6c871fd301d8a889a14cba47d8984d74d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "konsole-lang \
konsole-part-lang \
konsole-part-lang-all \
locale(konsole-part:af) \
locale(konsole-part:ar) \
locale(konsole-part:az) \
locale(konsole-part:be) \
locale(konsole-part:be@latin) \
locale(konsole-part:bg) \
locale(konsole-part:bn) \
locale(konsole-part:bn_IN) \
locale(konsole-part:br) \
locale(konsole-part:bs) \
locale(konsole-part:ca) \
locale(konsole-part:ca@valencia) \
locale(konsole-part:cs) \
locale(konsole-part:cy) \
locale(konsole-part:da) \
locale(konsole-part:de) \
locale(konsole-part:el) \
locale(konsole-part:en_GB) \
locale(konsole-part:eo) \
locale(konsole-part:es) \
locale(konsole-part:et) \
locale(konsole-part:eu) \
locale(konsole-part:fa) \
locale(konsole-part:fi) \
locale(konsole-part:fr) \
locale(konsole-part:ga) \
locale(konsole-part:gl) \
locale(konsole-part:gu) \
locale(konsole-part:he) \
locale(konsole-part:hi) \
locale(konsole-part:hr) \
locale(konsole-part:hu) \
locale(konsole-part:ia) \
locale(konsole-part:id) \
locale(konsole-part:is) \
locale(konsole-part:it) \
locale(konsole-part:ja) \
locale(konsole-part:ka) \
locale(konsole-part:kk) \
locale(konsole-part:km) \
locale(konsole-part:kn) \
locale(konsole-part:ko) \
locale(konsole-part:lt) \
locale(konsole-part:lv) \
locale(konsole-part:mai) \
locale(konsole-part:mk) \
locale(konsole-part:ml) \
locale(konsole-part:mr) \
locale(konsole-part:ms) \
locale(konsole-part:nb) \
locale(konsole-part:nds) \
locale(konsole-part:ne) \
locale(konsole-part:nl) \
locale(konsole-part:nn) \
locale(konsole-part:oc) \
locale(konsole-part:or) \
locale(konsole-part:pa) \
locale(konsole-part:pl) \
locale(konsole-part:pt) \
locale(konsole-part:pt_BR) \
locale(konsole-part:ro) \
locale(konsole-part:ru) \
locale(konsole-part:si) \
locale(konsole-part:sk) \
locale(konsole-part:sl) \
locale(konsole-part:sq) \
locale(konsole-part:sr) \
locale(konsole-part:sr@ijekavian) \
locale(konsole-part:sr@ijekavianlatin) \
locale(konsole-part:sr@latin) \
locale(konsole-part:sv) \
locale(konsole-part:ta) \
locale(konsole-part:te) \
locale(konsole-part:th) \
locale(konsole-part:tr) \
locale(konsole-part:ug) \
locale(konsole-part:uk) \
locale(konsole-part:vi) \
locale(konsole-part:wa) \
locale(konsole-part:zh_CN) \
locale(konsole-part:zh_TW)"
RDEPENDS:${PN} += "konsole-part"

inherit rpm
