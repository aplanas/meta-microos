SUMMARY = "Translations for nemo-extensions packages"
DESCRIPTION = "Provides translations for the nemo-extensions packages."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.1"

RPM_NAME = "nemo-extensions-lang-5.6.1-1.2.noarch.rpm"
RPM_HASH = "73e4fa217fda1abc8f9b929fbfc52d224c05849f9c2e9c300760f6a0016d3813f15ebdb509cb46a97291b5969427ac765301d362813bca7337c8b12dc5b709be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(nemo-extensions:ar) locale(nemo-extensions:be) locale(nemo-extensions:bg) locale(nemo-extensions:bn) locale(nemo-extensions:ca) locale(nemo-extensions:ca@valencia) locale(nemo-extensions:cs) locale(nemo-extensions:cy) locale(nemo-extensions:da) locale(nemo-extensions:de) locale(nemo-extensions:el) locale(nemo-extensions:en_GB) locale(nemo-extensions:eo) locale(nemo-extensions:es) locale(nemo-extensions:et) locale(nemo-extensions:eu) locale(nemo-extensions:fi) locale(nemo-extensions:fr) locale(nemo-extensions:fr_CA) locale(nemo-extensions:he) locale(nemo-extensions:hi) locale(nemo-extensions:hr) locale(nemo-extensions:hu) locale(nemo-extensions:ia) locale(nemo-extensions:id) locale(nemo-extensions:is) locale(nemo-extensions:it) locale(nemo-extensions:ja) locale(nemo-extensions:kk) locale(nemo-extensions:ko) locale(nemo-extensions:lt) locale(nemo-extensions:nb) locale(nemo-extensions:ne) locale(nemo-extensions:nl) locale(nemo-extensions:oc) locale(nemo-extensions:pl) locale(nemo-extensions:pt) locale(nemo-extensions:pt_BR) locale(nemo-extensions:ro) locale(nemo-extensions:ru) locale(nemo-extensions:sk) locale(nemo-extensions:sl) locale(nemo-extensions:sr) locale(nemo-extensions:sr@latin) locale(nemo-extensions:sv) locale(nemo-extensions:ta) locale(nemo-extensions:th) locale(nemo-extensions:tr) locale(nemo-extensions:uk) locale(nemo-extensions:vi) locale(nemo-extensions:zh_CN) locale(nemo-extensions:zh_HK) locale(nemo-extensions:zh_TW) nemo-extension-compare-lang nemo-extension-emblems-lang nemo-extension-gtkhash-lang nemo-extension-image-converter-lang nemo-extension-pastebin-lang nemo-extension-preview-lang nemo-extension-repairer-lang nemo-extension-seahorse-lang nemo-extension-share-lang nemo-extensions-lang nemo-extensions-lang-all"
RDEPENDS:${PN} += ""

inherit rpm
