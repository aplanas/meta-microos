SUMMARY = "Translations for package libkcompactdisc"
DESCRIPTION = "Provides translations for the 'libkcompactdisc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "libkcompactdisc-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "9ebb9f9e34a98c1d0c7900d9330fcde1e91a8dbba120c89bafa508b6f8d6befe958f6381f0b9c9c14486c3e22996a73c9e07ef9fe31dadc0393cc7004caed63c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkcompactdisc-lang libkcompactdisc-lang-all locale(libkcompactdisc:ar) locale(libkcompactdisc:be) locale(libkcompactdisc:bg) locale(libkcompactdisc:bs) locale(libkcompactdisc:ca) locale(libkcompactdisc:ca@valencia) locale(libkcompactdisc:cs) locale(libkcompactdisc:da) locale(libkcompactdisc:de) locale(libkcompactdisc:el) locale(libkcompactdisc:en_GB) locale(libkcompactdisc:eo) locale(libkcompactdisc:es) locale(libkcompactdisc:et) locale(libkcompactdisc:eu) locale(libkcompactdisc:fi) locale(libkcompactdisc:fr) locale(libkcompactdisc:ga) locale(libkcompactdisc:gl) locale(libkcompactdisc:he) locale(libkcompactdisc:hi) locale(libkcompactdisc:hr) locale(libkcompactdisc:hu) locale(libkcompactdisc:ia) locale(libkcompactdisc:is) locale(libkcompactdisc:it) locale(libkcompactdisc:ja) locale(libkcompactdisc:ka) locale(libkcompactdisc:kk) locale(libkcompactdisc:km) locale(libkcompactdisc:ko) locale(libkcompactdisc:lt) locale(libkcompactdisc:lv) locale(libkcompactdisc:mk) locale(libkcompactdisc:mr) locale(libkcompactdisc:nb) locale(libkcompactdisc:nds) locale(libkcompactdisc:nl) locale(libkcompactdisc:nn) locale(libkcompactdisc:oc) locale(libkcompactdisc:pa) locale(libkcompactdisc:pl) locale(libkcompactdisc:pt) locale(libkcompactdisc:pt_BR) locale(libkcompactdisc:ro) locale(libkcompactdisc:ru) locale(libkcompactdisc:sk) locale(libkcompactdisc:sl) locale(libkcompactdisc:sq) locale(libkcompactdisc:sr) locale(libkcompactdisc:sr@ijekavian) locale(libkcompactdisc:sr@ijekavianlatin) locale(libkcompactdisc:sr@latin) locale(libkcompactdisc:sv) locale(libkcompactdisc:ta) locale(libkcompactdisc:th) locale(libkcompactdisc:tr) locale(libkcompactdisc:ug) locale(libkcompactdisc:uk) locale(libkcompactdisc:wa) locale(libkcompactdisc:zh_CN) locale(libkcompactdisc:zh_TW)"
RDEPENDS:${PN} += "libkcompactdisc"

inherit rpm
