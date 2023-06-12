SUMMARY = "Translations for package kmymoney"
DESCRIPTION = "Provides translations for the 'kmymoney' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-lang-5.1.3-2.10.noarch.rpm"
RPM_HASH = "0332bf2eb2b14251a89f8671c1462f5f7d7c5a9500875ade366c3515a0cc799eb46a8b48b865c69e56e4fe50c561e58be4f18857dd6ff8d8efe18d68b86d0ed9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmymoney-lang \
kmymoney-lang-all \
locale(kmymoney:ar) \
locale(kmymoney:ast) \
locale(kmymoney:bg) \
locale(kmymoney:bs) \
locale(kmymoney:ca) \
locale(kmymoney:ca@valencia) \
locale(kmymoney:cs) \
locale(kmymoney:da) \
locale(kmymoney:de) \
locale(kmymoney:el) \
locale(kmymoney:en_GB) \
locale(kmymoney:eo) \
locale(kmymoney:es) \
locale(kmymoney:et) \
locale(kmymoney:eu) \
locale(kmymoney:fi) \
locale(kmymoney:fr) \
locale(kmymoney:ga) \
locale(kmymoney:gl) \
locale(kmymoney:hu) \
locale(kmymoney:ia) \
locale(kmymoney:it) \
locale(kmymoney:kk) \
locale(kmymoney:ko) \
locale(kmymoney:lt) \
locale(kmymoney:mr) \
locale(kmymoney:ms) \
locale(kmymoney:nds) \
locale(kmymoney:nl) \
locale(kmymoney:pl) \
locale(kmymoney:pt) \
locale(kmymoney:pt_BR) \
locale(kmymoney:ro) \
locale(kmymoney:ru) \
locale(kmymoney:sk) \
locale(kmymoney:sl) \
locale(kmymoney:sv) \
locale(kmymoney:tr) \
locale(kmymoney:ug) \
locale(kmymoney:uk) \
locale(kmymoney:zh_CN) \
locale(kmymoney:zh_TW)"
RDEPENDS:${PN} += "kmymoney"

inherit rpm
