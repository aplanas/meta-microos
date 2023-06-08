SUMMARY = "Translations for package libfm"
DESCRIPTION = "Provides translations for the 'libfm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-lang-1.3.2-1.12.noarch.rpm"
RPM_HASH = "e4a12704f9773994b1fd7ea315720a8927d15e1a070324b38171f3edcb4538bbde66b3cb41a02c9cadff6c5dbd7fe9e92d3cc49e987113a05544ab171c5ab873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-lang libfm-lang-all locale(libfm:af) locale(libfm:ar) locale(libfm:be) locale(libfm:bg) locale(libfm:bn) locale(libfm:bn_IN) locale(libfm:ca) locale(libfm:cs) locale(libfm:da) locale(libfm:de) locale(libfm:el) locale(libfm:en_GB) locale(libfm:es) locale(libfm:et) locale(libfm:eu) locale(libfm:fa) locale(libfm:fi) locale(libfm:fr) locale(libfm:gl) locale(libfm:he) locale(libfm:hr) locale(libfm:hu) locale(libfm:id) locale(libfm:is) locale(libfm:it) locale(libfm:ja) locale(libfm:kk) locale(libfm:ko) locale(libfm:lt) locale(libfm:ml) locale(libfm:ms) locale(libfm:nb) locale(libfm:nl) locale(libfm:nn) locale(libfm:pa) locale(libfm:pl) locale(libfm:pt) locale(libfm:pt_BR) locale(libfm:ro) locale(libfm:ru) locale(libfm:sk) locale(libfm:sl) locale(libfm:sr) locale(libfm:sr@latin) locale(libfm:sv) locale(libfm:te) locale(libfm:th) locale(libfm:tr) locale(libfm:ug) locale(libfm:uk) locale(libfm:vi) locale(libfm:zh_CN) locale(libfm:zh_TW)"
RDEPENDS:${PN} += "libfm"

inherit rpm
