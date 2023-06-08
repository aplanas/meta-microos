SUMMARY = "Translations for package xsnow"
DESCRIPTION = "Provides translations for the 'xsnow' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.7.4"

RPM_NAME = "xsnow-lang-3.7.4-1.1.noarch.rpm"
RPM_HASH = "a032329d7d0e79d207b5278b5060a97803e6d49806a7fa0c2f52374144b8be84697cafe03fab7ed01a37e90168a6b19558fb94c2900845d56032f18854c14ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xsnow:cs) locale(xsnow:da) locale(xsnow:de) locale(xsnow:el) locale(xsnow:en) locale(xsnow:es) locale(xsnow:et) locale(xsnow:fi) locale(xsnow:fr) locale(xsnow:hu) locale(xsnow:is) locale(xsnow:it) locale(xsnow:lt) locale(xsnow:lv) locale(xsnow:nl) locale(xsnow:pl) locale(xsnow:pt) locale(xsnow:ro) locale(xsnow:ru) locale(xsnow:sv) locale(xsnow:uk) xsnow-lang xsnow-lang-all"
RDEPENDS:${PN} += "xsnow"

inherit rpm
