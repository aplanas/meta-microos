SUMMARY = "Translations for package tokodon"
DESCRIPTION = "Provides translations for the 'tokodon' package."
LICENSE = "GPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "tokodon-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "b0fafcb77bf2c53d175a9dfe6f1daf67b04e9480abaaefe089164e76f7662525ed64fc6c1b25f16799b5f51981c0775c7485c8fb14638c2f32c1e814a913d542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(tokodon:ca) locale(tokodon:ca@valencia) locale(tokodon:cs) locale(tokodon:de) locale(tokodon:en_GB) locale(tokodon:es) locale(tokodon:fi) locale(tokodon:fr) locale(tokodon:gl) locale(tokodon:hu) locale(tokodon:id) locale(tokodon:is) locale(tokodon:it) locale(tokodon:ja) locale(tokodon:ka) locale(tokodon:ko) locale(tokodon:lt) locale(tokodon:nl) locale(tokodon:pl) locale(tokodon:pt) locale(tokodon:pt_BR) locale(tokodon:sk) locale(tokodon:sl) locale(tokodon:sv) locale(tokodon:tr) locale(tokodon:uk) locale(tokodon:zh_CN) locale(tokodon:zh_TW) tokodon-lang tokodon-lang-all"
RDEPENDS:${PN} += "tokodon"

inherit rpm
