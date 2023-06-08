SUMMARY = "Translations for package libkgapi"
DESCRIPTION = "Provides translations for the 'libkgapi' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "libkgapi-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "5fcabf2fdaf9d630044475e9da14767b56088ca5d568564a6ef3bdad22c71ccc9e0fdb05cbe8727bc280c48e808f18be994849e1c08cac39594f0ac5bab92696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkgapi-lang libkgapi-lang-all locale(libkgapi:ar) locale(libkgapi:bs) locale(libkgapi:ca) locale(libkgapi:ca@valencia) locale(libkgapi:cs) locale(libkgapi:da) locale(libkgapi:de) locale(libkgapi:el) locale(libkgapi:en_GB) locale(libkgapi:es) locale(libkgapi:et) locale(libkgapi:eu) locale(libkgapi:fi) locale(libkgapi:fr) locale(libkgapi:ga) locale(libkgapi:gl) locale(libkgapi:hu) locale(libkgapi:ia) locale(libkgapi:it) locale(libkgapi:ja) locale(libkgapi:ka) locale(libkgapi:kk) locale(libkgapi:km) locale(libkgapi:ko) locale(libkgapi:lt) locale(libkgapi:mr) locale(libkgapi:nb) locale(libkgapi:nds) locale(libkgapi:nl) locale(libkgapi:nn) locale(libkgapi:pl) locale(libkgapi:pt) locale(libkgapi:pt_BR) locale(libkgapi:ro) locale(libkgapi:ru) locale(libkgapi:sk) locale(libkgapi:sl) locale(libkgapi:sr) locale(libkgapi:sr@ijekavian) locale(libkgapi:sr@ijekavianlatin) locale(libkgapi:sr@latin) locale(libkgapi:sv) locale(libkgapi:tr) locale(libkgapi:ug) locale(libkgapi:uk) locale(libkgapi:zh_CN) locale(libkgapi:zh_TW)"
RDEPENDS:${PN} += "libkgapi"

inherit rpm
