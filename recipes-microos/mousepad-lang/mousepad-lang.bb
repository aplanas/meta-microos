SUMMARY = "Translations for package mousepad"
DESCRIPTION = "Provides translations for the 'mousepad' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.0"

RPM_NAME = "mousepad-lang-0.6.0-1.3.noarch.rpm"
RPM_HASH = "bc0f0af805c7e97d0b0cf93e216df6e860fddca64f96380ff6ab8f606386996230f84c606951ecbb4005a96948576cddeba6a9f51b963d391efd4f0272e6e534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(mousepad:ar) locale(mousepad:ast) locale(mousepad:be) locale(mousepad:bg) locale(mousepad:ca) locale(mousepad:cs) locale(mousepad:da) locale(mousepad:de) locale(mousepad:el) locale(mousepad:en_AU) locale(mousepad:en_GB) locale(mousepad:es) locale(mousepad:et) locale(mousepad:eu) locale(mousepad:fi) locale(mousepad:fr) locale(mousepad:gl) locale(mousepad:he) locale(mousepad:hr) locale(mousepad:hu) locale(mousepad:id) locale(mousepad:is) locale(mousepad:it) locale(mousepad:ja) locale(mousepad:kk) locale(mousepad:ko) locale(mousepad:lt) locale(mousepad:ms) locale(mousepad:nb) locale(mousepad:nl) locale(mousepad:nn) locale(mousepad:oc) locale(mousepad:pl) locale(mousepad:pt) locale(mousepad:pt_BR) locale(mousepad:ro) locale(mousepad:ru) locale(mousepad:sk) locale(mousepad:sl) locale(mousepad:sq) locale(mousepad:sr) locale(mousepad:sv) locale(mousepad:te) locale(mousepad:th) locale(mousepad:tr) locale(mousepad:ug) locale(mousepad:uk) locale(mousepad:zh_CN) locale(mousepad:zh_TW) mousepad-lang mousepad-lang-all"
RDEPENDS:${PN} += "mousepad"

inherit rpm
