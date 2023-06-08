SUMMARY = "Translations for package glibc"
DESCRIPTION = "Provides translations for the 'glibc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-lang-2.37-3.1.noarch.rpm"
RPM_HASH = "a5ec5cc1d13bb245cf6b37fd3fb6650622022756f7d4c81de4101c35307fe3698aa28012fc6cf49f52763d8b76ac6808c8b046407387eaf20189cedb7d14be57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-lang glibc-lang-all locale(glibc:be) locale(glibc:bg) locale(glibc:ca) locale(glibc:cs) locale(glibc:da) locale(glibc:de) locale(glibc:el) locale(glibc:en_GB) locale(glibc:eo) locale(glibc:es) locale(glibc:fi) locale(glibc:fr) locale(glibc:gl) locale(glibc:hr) locale(glibc:hu) locale(glibc:ia) locale(glibc:id) locale(glibc:it) locale(glibc:ja) locale(glibc:ka) locale(glibc:ko) locale(glibc:lt) locale(glibc:nb) locale(glibc:nl) locale(glibc:pl) locale(glibc:pt) locale(glibc:pt_BR) locale(glibc:ru) locale(glibc:sk) locale(glibc:sl) locale(glibc:sr) locale(glibc:sv) locale(glibc:tr) locale(glibc:uk) locale(glibc:vi) locale(glibc:zh_CN) locale(glibc:zh_TW)"
RDEPENDS:${PN} += "glibc"

inherit rpm
