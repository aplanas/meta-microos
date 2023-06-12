SUMMARY = "Translations for package gscan2pdf"
DESCRIPTION = "Provides translations for the 'gscan2pdf' package."
LICENSE = "GPL-3.0-only"

PV = "2.13.2"

RPM_NAME = "gscan2pdf-lang-2.13.2-1.1.noarch.rpm"
RPM_HASH = "f783017dee3e815ad09a9b89ad4c414292ff85afcce630869ba7a023ba6d993efb32e2fb10c1b8500ef01857690f4287daee3ed610e96b835e625e9538e9c46c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gscan2pdf-lang \
gscan2pdf-lang-all \
locale(gscan2pdf:be) \
locale(gscan2pdf:bg) \
locale(gscan2pdf:ca) \
locale(gscan2pdf:cs) \
locale(gscan2pdf:da) \
locale(gscan2pdf:de) \
locale(gscan2pdf:el) \
locale(gscan2pdf:en_GB) \
locale(gscan2pdf:es) \
locale(gscan2pdf:eu) \
locale(gscan2pdf:fa) \
locale(gscan2pdf:fi) \
locale(gscan2pdf:fr) \
locale(gscan2pdf:gl) \
locale(gscan2pdf:gu) \
locale(gscan2pdf:he) \
locale(gscan2pdf:hr) \
locale(gscan2pdf:hu) \
locale(gscan2pdf:it) \
locale(gscan2pdf:ja) \
locale(gscan2pdf:ko) \
locale(gscan2pdf:nb) \
locale(gscan2pdf:nl) \
locale(gscan2pdf:oc) \
locale(gscan2pdf:pl) \
locale(gscan2pdf:pt) \
locale(gscan2pdf:pt_BR) \
locale(gscan2pdf:ru) \
locale(gscan2pdf:sk) \
locale(gscan2pdf:sl) \
locale(gscan2pdf:sv) \
locale(gscan2pdf:tr) \
locale(gscan2pdf:uk) \
locale(gscan2pdf:zh_CN) \
locale(gscan2pdf:zh_TW)"
RDEPENDS:${PN} += "gscan2pdf"

inherit rpm
