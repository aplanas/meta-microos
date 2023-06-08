SUMMARY = "KDE Plasma Activities support"
DESCRIPTION = "Provides translations to the package kactivitymanagerd."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "kactivitymanagerd-lang-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "7e5218eb6242e35940adafecf028cd88b468578c7a4517946eba7035c0ac64723f1944af8a902dd807a93a45e8058acb7aed74c3fadaf97e2be66b5af3afc86b"

RPROVIDES:${PN} += "kactivitymanagerd-lang kactivitymanagerd-lang(aarch-64) libKF5Activities5-lang locale(kactivitymanagerd:ar) locale(kactivitymanagerd:az) locale(kactivitymanagerd:bg) locale(kactivitymanagerd:bs) locale(kactivitymanagerd:ca) locale(kactivitymanagerd:ca@valencia) locale(kactivitymanagerd:cs) locale(kactivitymanagerd:da) locale(kactivitymanagerd:de) locale(kactivitymanagerd:el) locale(kactivitymanagerd:en_GB) locale(kactivitymanagerd:es) locale(kactivitymanagerd:et) locale(kactivitymanagerd:eu) locale(kactivitymanagerd:fi) locale(kactivitymanagerd:fr) locale(kactivitymanagerd:ga) locale(kactivitymanagerd:gd) locale(kactivitymanagerd:gl) locale(kactivitymanagerd:he) locale(kactivitymanagerd:hi) locale(kactivitymanagerd:hu) locale(kactivitymanagerd:ia) locale(kactivitymanagerd:id) locale(kactivitymanagerd:is) locale(kactivitymanagerd:it) locale(kactivitymanagerd:ka) locale(kactivitymanagerd:kk) locale(kactivitymanagerd:ko) locale(kactivitymanagerd:lt) locale(kactivitymanagerd:lv) locale(kactivitymanagerd:mr) locale(kactivitymanagerd:nb) locale(kactivitymanagerd:nds) locale(kactivitymanagerd:nl) locale(kactivitymanagerd:nn) locale(kactivitymanagerd:pa) locale(kactivitymanagerd:pl) locale(kactivitymanagerd:pt) locale(kactivitymanagerd:pt_BR) locale(kactivitymanagerd:ro) locale(kactivitymanagerd:ru) locale(kactivitymanagerd:sk) locale(kactivitymanagerd:sl) locale(kactivitymanagerd:sr) locale(kactivitymanagerd:sr@ijekavian) locale(kactivitymanagerd:sr@ijekavianlatin) locale(kactivitymanagerd:sr@latin) locale(kactivitymanagerd:sv) locale(kactivitymanagerd:tr) locale(kactivitymanagerd:ug) locale(kactivitymanagerd:uk) locale(kactivitymanagerd:vi) locale(kactivitymanagerd:zh_CN) locale(kactivitymanagerd:zh_TW)"
RDEPENDS:${PN} += "kactivitymanagerd"

inherit rpm
