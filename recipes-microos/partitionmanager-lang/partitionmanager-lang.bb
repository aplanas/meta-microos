SUMMARY = "Translations for package partitionmanager"
DESCRIPTION = "Provides translations for the 'partitionmanager' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.0"

RPM_NAME = "partitionmanager-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "00911df448aab0f5cea8948a26d0d3c6f9c728d78627c785ed3db9eadb849ac39778d7f061524d63769760d1bcbfdbc8df30072da78e6a006e7aea692c483e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(partitionmanager:ar) locale(partitionmanager:az) locale(partitionmanager:bg) locale(partitionmanager:bs) locale(partitionmanager:ca) locale(partitionmanager:ca@valencia) locale(partitionmanager:cs) locale(partitionmanager:da) locale(partitionmanager:de) locale(partitionmanager:el) locale(partitionmanager:en_GB) locale(partitionmanager:eo) locale(partitionmanager:es) locale(partitionmanager:et) locale(partitionmanager:eu) locale(partitionmanager:fi) locale(partitionmanager:fr) locale(partitionmanager:ga) locale(partitionmanager:gl) locale(partitionmanager:hr) locale(partitionmanager:hu) locale(partitionmanager:ia) locale(partitionmanager:id) locale(partitionmanager:is) locale(partitionmanager:it) locale(partitionmanager:ja) locale(partitionmanager:ka) locale(partitionmanager:ko) locale(partitionmanager:lt) locale(partitionmanager:lv) locale(partitionmanager:mai) locale(partitionmanager:mr) locale(partitionmanager:nb) locale(partitionmanager:nds) locale(partitionmanager:nl) locale(partitionmanager:nn) locale(partitionmanager:pa) locale(partitionmanager:pl) locale(partitionmanager:pt) locale(partitionmanager:pt_BR) locale(partitionmanager:ro) locale(partitionmanager:ru) locale(partitionmanager:sk) locale(partitionmanager:sl) locale(partitionmanager:sr) locale(partitionmanager:sr@ijekavian) locale(partitionmanager:sr@ijekavianlatin) locale(partitionmanager:sr@latin) locale(partitionmanager:sv) locale(partitionmanager:th) locale(partitionmanager:tr) locale(partitionmanager:ug) locale(partitionmanager:uk) locale(partitionmanager:zh_CN) locale(partitionmanager:zh_TW) partitionmanager-lang partitionmanager-lang-all"
RDEPENDS:${PN} += "partitionmanager"

inherit rpm
