SUMMARY = "Translations for package hello"
DESCRIPTION = "Provides translations for the 'hello' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.1"

RPM_NAME = "hello-lang-2.12.1-1.3.noarch.rpm"
RPM_HASH = "abe40994b64f6af9682735ae6fec7bfaad925818eee2024cb939937f03f1148d065146155cadb3bb17931c71bf80bc7d9c5c5b40fcbb2959805ef00b34d74183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hello-lang \
hello-lang-all \
locale(hello:ast) \
locale(hello:bg) \
locale(hello:ca) \
locale(hello:da) \
locale(hello:de) \
locale(hello:el) \
locale(hello:eo) \
locale(hello:es) \
locale(hello:et) \
locale(hello:eu) \
locale(hello:fa) \
locale(hello:fi) \
locale(hello:fr) \
locale(hello:ga) \
locale(hello:gl) \
locale(hello:he) \
locale(hello:hr) \
locale(hello:hu) \
locale(hello:id) \
locale(hello:it) \
locale(hello:ja) \
locale(hello:ka) \
locale(hello:ko) \
locale(hello:lv) \
locale(hello:ms) \
locale(hello:nb) \
locale(hello:nl) \
locale(hello:nn) \
locale(hello:pl) \
locale(hello:pt) \
locale(hello:pt_BR) \
locale(hello:ro) \
locale(hello:ru) \
locale(hello:sk) \
locale(hello:sl) \
locale(hello:sr) \
locale(hello:sv) \
locale(hello:ta) \
locale(hello:th) \
locale(hello:tr) \
locale(hello:uk) \
locale(hello:vi) \
locale(hello:zh_CN) \
locale(hello:zh_TW)"
RDEPENDS:${PN} += "hello"

inherit rpm
