SUMMARY = "Translations for package gwenhywfar"
DESCRIPTION = "Provides translations for the 'gwenhywfar' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-lang-5.10.1-1.4.noarch.rpm"
RPM_HASH = "e48f64e8cba487c23155a8fc8ebb320dede55334de0a742d53c54a2fa0eb249d68a5f5384e5fbf3a6e62d7c13328fece57da3621d5e9a17fd340791aa0b408bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gwenhywfar-lang gwenhywfar-lang-all locale(gwenhywfar:de)"
RDEPENDS:${PN} += "gwenhywfar"

inherit rpm
