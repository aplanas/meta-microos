SUMMARY = "Translations for package sysprof"
DESCRIPTION = "Provides translations for the 'sysprof' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.48.0"

RPM_NAME = "sysprof-lang-3.48.0-1.1.noarch.rpm"
RPM_HASH = "970d8d62c527c0d9782af61cb0138b44fc5ea1e0733cbca271429626fac2e6a032385afbe4e7647f5d9b7aacac416f20bc999943a6c00359bf087b2d2fe50bc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(sysprof:ca) locale(sysprof:cs) locale(sysprof:da) locale(sysprof:de) locale(sysprof:el) locale(sysprof:es) locale(sysprof:eu) locale(sysprof:fi) locale(sysprof:fr) locale(sysprof:fur) locale(sysprof:gl) locale(sysprof:he) locale(sysprof:hu) locale(sysprof:id) locale(sysprof:it) locale(sysprof:ka) locale(sysprof:ko) locale(sysprof:nl) locale(sysprof:pl) locale(sysprof:pt) locale(sysprof:pt_BR) locale(sysprof:ro) locale(sysprof:ru) locale(sysprof:sk) locale(sysprof:sl) locale(sysprof:sr) locale(sysprof:sv) locale(sysprof:uk) locale(sysprof:zh_CN) sysprof-lang sysprof-lang-all"
RDEPENDS:${PN} += "sysprof"

inherit rpm
