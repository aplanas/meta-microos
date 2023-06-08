SUMMARY = "Translations for package plasma5-integration-plugin"
DESCRIPTION = "Provides translations for the 'plasma5-integration-plugin' package."
LICENSE = "GPL-2.0+"

PV = "5.27.4"

RPM_NAME = "plasma5-integration-plugin-lang-5.27.4-1.2.noarch.rpm"
RPM_HASH = "b6023288e7f869154f79f10305e2697e8901bb290e41a1507aa615c7e49466922dbb0622b6d7eb0e3ad3c951a2981143f1a390033635bd227457536120e2d6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(plasma5-integration-plugin:ar) locale(plasma5-integration-plugin:az) locale(plasma5-integration-plugin:bg) locale(plasma5-integration-plugin:ca) locale(plasma5-integration-plugin:ca@valencia) locale(plasma5-integration-plugin:cs) locale(plasma5-integration-plugin:da) locale(plasma5-integration-plugin:de) locale(plasma5-integration-plugin:el) locale(plasma5-integration-plugin:en_GB) locale(plasma5-integration-plugin:es) locale(plasma5-integration-plugin:et) locale(plasma5-integration-plugin:eu) locale(plasma5-integration-plugin:fi) locale(plasma5-integration-plugin:fr) locale(plasma5-integration-plugin:gl) locale(plasma5-integration-plugin:he) locale(plasma5-integration-plugin:hi) locale(plasma5-integration-plugin:hu) locale(plasma5-integration-plugin:ia) locale(plasma5-integration-plugin:id) locale(plasma5-integration-plugin:it) locale(plasma5-integration-plugin:ja) locale(plasma5-integration-plugin:ka) locale(plasma5-integration-plugin:ko) locale(plasma5-integration-plugin:lt) locale(plasma5-integration-plugin:nb) locale(plasma5-integration-plugin:nl) locale(plasma5-integration-plugin:nn) locale(plasma5-integration-plugin:pa) locale(plasma5-integration-plugin:pl) locale(plasma5-integration-plugin:pt) locale(plasma5-integration-plugin:pt_BR) locale(plasma5-integration-plugin:ro) locale(plasma5-integration-plugin:ru) locale(plasma5-integration-plugin:sk) locale(plasma5-integration-plugin:sl) locale(plasma5-integration-plugin:sr) locale(plasma5-integration-plugin:sr@ijekavian) locale(plasma5-integration-plugin:sr@ijekavianlatin) locale(plasma5-integration-plugin:sr@latin) locale(plasma5-integration-plugin:sv) locale(plasma5-integration-plugin:ta) locale(plasma5-integration-plugin:tr) locale(plasma5-integration-plugin:uk) locale(plasma5-integration-plugin:vi) locale(plasma5-integration-plugin:zh_CN) locale(plasma5-integration-plugin:zh_TW) plasma5-integration-plugin-lang plasma5-integration-plugin-lang-all"
RDEPENDS:${PN} += "plasma5-integration-plugin"

inherit rpm
