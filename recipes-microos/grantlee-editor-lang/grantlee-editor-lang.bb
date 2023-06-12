SUMMARY = "Translations for package grantlee-editor"
DESCRIPTION = "Provides translations for the 'grantlee-editor' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "grantlee-editor-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "996848ffc2910733be9644ff067df5c80c54e6743cff54f55fbc4a1688a439cbc400dd543e7feafbc5a77a72431e8c091fc8ebba11346c2e1b43d9c7cd49843b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grantlee-editor-lang grantlee-editor-lang-all locale(grantlee-editor:ar) locale(grantlee-editor:bg) locale(grantlee-editor:bs) locale(grantlee-editor:ca) locale(grantlee-editor:ca@valencia) locale(grantlee-editor:cs) locale(grantlee-editor:da) locale(grantlee-editor:de) locale(grantlee-editor:el) locale(grantlee-editor:en_GB) locale(grantlee-editor:es) locale(grantlee-editor:et) locale(grantlee-editor:eu) locale(grantlee-editor:fi) locale(grantlee-editor:fr) locale(grantlee-editor:gl) locale(grantlee-editor:hu) locale(grantlee-editor:ia) locale(grantlee-editor:it) locale(grantlee-editor:ja) locale(grantlee-editor:ka) locale(grantlee-editor:kk) locale(grantlee-editor:ko) locale(grantlee-editor:lt) locale(grantlee-editor:mr) locale(grantlee-editor:nb) locale(grantlee-editor:nds) locale(grantlee-editor:nl) locale(grantlee-editor:pl) locale(grantlee-editor:pt) locale(grantlee-editor:pt_BR) locale(grantlee-editor:ro) locale(grantlee-editor:ru) locale(grantlee-editor:sk) locale(grantlee-editor:sl) locale(grantlee-editor:sr) locale(grantlee-editor:sr@ijekavian) locale(grantlee-editor:sr@ijekavianlatin) locale(grantlee-editor:sr@latin) locale(grantlee-editor:sv) locale(grantlee-editor:tr) locale(grantlee-editor:ug) locale(grantlee-editor:uk) locale(grantlee-editor:zh_CN) locale(grantlee-editor:zh_TW)"
RDEPENDS:${PN} += "grantlee-editor"

inherit rpm
