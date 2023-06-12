SUMMARY = "Translations for package gimp-plugin-lqr"
DESCRIPTION = "Provides translations for the 'gimp-plugin-lqr' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "gimp-plugin-lqr-lang-0.7.2-6.13.noarch.rpm"
RPM_HASH = "f8d1eb59f6831e2fd1801a491b342737a02054342b928cf5882ed2d194c704b3ee383fab21797a3e2f9f2b69724a40fde2aad0f53d7782e8ec68436e6c6f1c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gimp-plugin-lqr-lang \
gimp-plugin-lqr-lang-all \
locale(gimp-plugin-lqr:de) \
locale(gimp-plugin-lqr:es_AR) \
locale(gimp-plugin-lqr:es_ES) \
locale(gimp-plugin-lqr:fr) \
locale(gimp-plugin-lqr:hu) \
locale(gimp-plugin-lqr:it) \
locale(gimp-plugin-lqr:nb_NO) \
locale(gimp-plugin-lqr:pt_BR) \
locale(gimp-plugin-lqr:ro) \
locale(gimp-plugin-lqr:ru) \
locale(gimp-plugin-lqr:sr) \
locale(gimp-plugin-lqr:zh_CN) \
locale(gimp-plugin-lqr:zh_TW)"
RDEPENDS:${PN} += "gimp-plugin-lqr"

inherit rpm
