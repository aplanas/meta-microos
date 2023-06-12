SUMMARY = "Translations for package glibc"
DESCRIPTION = "Provides translations for the 'glibc' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-2.1-or-later-WITH-GCC-exception-2.0"

PV = "2.37"

RPM_NAME = "glibc-lang-2.37-4.1.noarch.rpm"
RPM_HASH = "f25b8abbebb398db9a31a20beeaec518192b25c7c0d5f90720af8952e916dea2734a0e608315a818f4b286f268c262af8a137924126646ccb6cb5d3fffb012be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-lang \
glibc-lang-all \
locale(glibc:be) \
locale(glibc:bg) \
locale(glibc:ca) \
locale(glibc:cs) \
locale(glibc:da) \
locale(glibc:de) \
locale(glibc:el) \
locale(glibc:en_GB) \
locale(glibc:eo) \
locale(glibc:es) \
locale(glibc:fi) \
locale(glibc:fr) \
locale(glibc:gl) \
locale(glibc:hr) \
locale(glibc:hu) \
locale(glibc:ia) \
locale(glibc:id) \
locale(glibc:it) \
locale(glibc:ja) \
locale(glibc:ka) \
locale(glibc:ko) \
locale(glibc:lt) \
locale(glibc:nb) \
locale(glibc:nl) \
locale(glibc:pl) \
locale(glibc:pt) \
locale(glibc:pt_BR) \
locale(glibc:ru) \
locale(glibc:sk) \
locale(glibc:sl) \
locale(glibc:sr) \
locale(glibc:sv) \
locale(glibc:tr) \
locale(glibc:uk) \
locale(glibc:vi) \
locale(glibc:zh_CN) \
locale(glibc:zh_TW)"
RDEPENDS:${PN} += "glibc"

inherit rpm
