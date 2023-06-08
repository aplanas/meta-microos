SUMMARY = "Translations for package msitools"
DESCRIPTION = "Provides translations for the 'msitools' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.101"

RPM_NAME = "msitools-lang-0.101-1.10.noarch.rpm"
RPM_HASH = "6558189ef48c82cab4bcffdaf802f7ca1705860f7b8b389f27b0206535f9e83f4b83036f37ecfc09be929726d98f477d4baecfcc7847bebf58ff1fc2ca402ff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(msitools:bs) locale(msitools:cs) locale(msitools:da) locale(msitools:de) locale(msitools:el) locale(msitools:es) locale(msitools:eu) locale(msitools:fr) locale(msitools:fur) locale(msitools:gl) locale(msitools:hr) locale(msitools:hu) locale(msitools:id) locale(msitools:it) locale(msitools:ko) locale(msitools:lt) locale(msitools:lv) locale(msitools:nb) locale(msitools:nl) locale(msitools:oc) locale(msitools:pl) locale(msitools:pt) locale(msitools:pt_BR) locale(msitools:ro) locale(msitools:ru) locale(msitools:sl) locale(msitools:sr) locale(msitools:sr@latin) locale(msitools:sv) locale(msitools:tr) locale(msitools:uk) locale(msitools:zh_CN) msitools-lang msitools-lang-all"
RDEPENDS:${PN} += "msitools"

inherit rpm
