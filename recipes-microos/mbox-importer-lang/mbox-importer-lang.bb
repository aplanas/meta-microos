SUMMARY = "Translations for package mbox-importer"
DESCRIPTION = "Provides translations for the 'mbox-importer' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "mbox-importer-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "d81c90ec2b61720c7d97fca18331201ee3aef860e18f1f5d0961ed5670935fa10c8790ee076460803a70146ef4f82ddfc373c7bff8a4f351c41ea88bef15c802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mbox-importer:ar) locale(mbox-importer:bg) locale(mbox-importer:bs) locale(mbox-importer:ca) locale(mbox-importer:ca@valencia) locale(mbox-importer:cs) locale(mbox-importer:da) locale(mbox-importer:de) locale(mbox-importer:el) locale(mbox-importer:en_GB) locale(mbox-importer:es) locale(mbox-importer:et) locale(mbox-importer:eu) locale(mbox-importer:fi) locale(mbox-importer:fr) locale(mbox-importer:gl) locale(mbox-importer:hi) locale(mbox-importer:hu) locale(mbox-importer:ia) locale(mbox-importer:it) locale(mbox-importer:ja) locale(mbox-importer:ka) locale(mbox-importer:kk) locale(mbox-importer:ko) locale(mbox-importer:lt) locale(mbox-importer:nb) locale(mbox-importer:nds) locale(mbox-importer:nl) locale(mbox-importer:nn) locale(mbox-importer:pl) locale(mbox-importer:pt) locale(mbox-importer:pt_BR) locale(mbox-importer:ro) locale(mbox-importer:ru) locale(mbox-importer:sk) locale(mbox-importer:sl) locale(mbox-importer:sr) locale(mbox-importer:sr@ijekavian) locale(mbox-importer:sr@ijekavianlatin) locale(mbox-importer:sr@latin) locale(mbox-importer:sv) locale(mbox-importer:tr) locale(mbox-importer:ug) locale(mbox-importer:uk) locale(mbox-importer:zh_CN) locale(mbox-importer:zh_TW) mbox-importer-lang mbox-importer-lang-all"
RDEPENDS:${PN} += "mbox-importer"

inherit rpm
