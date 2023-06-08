SUMMARY = "Translations for package step"
DESCRIPTION = "Provides translations for the 'step' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "step-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6cef4fb00d05d861e814e6c56226c88aa100b42e8d5af467ec6f101b37d902327d31bcc730f9f76bc315aa5cb753bcb2c462a3fa4395471d730b67318599cc96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(step:ar) locale(step:be) locale(step:bg) locale(step:bs) locale(step:ca) locale(step:ca@valencia) locale(step:cs) locale(step:da) locale(step:de) locale(step:el) locale(step:en_GB) locale(step:eo) locale(step:es) locale(step:et) locale(step:eu) locale(step:fi) locale(step:fr) locale(step:ga) locale(step:gl) locale(step:gu) locale(step:hr) locale(step:hu) locale(step:ia) locale(step:it) locale(step:ja) locale(step:ka) locale(step:kk) locale(step:km) locale(step:ko) locale(step:lt) locale(step:lv) locale(step:mai) locale(step:ml) locale(step:mr) locale(step:nb) locale(step:nds) locale(step:nl) locale(step:nn) locale(step:oc) locale(step:pa) locale(step:pl) locale(step:pt) locale(step:pt_BR) locale(step:ro) locale(step:ru) locale(step:si) locale(step:sk) locale(step:sl) locale(step:sq) locale(step:sv) locale(step:th) locale(step:tr) locale(step:ug) locale(step:uk) locale(step:zh_CN) locale(step:zh_TW) step-lang step-lang-all"
RDEPENDS:${PN} += "step"

inherit rpm
