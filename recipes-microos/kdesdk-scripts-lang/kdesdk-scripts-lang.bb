SUMMARY = "Translations for package kdesdk-scripts"
DESCRIPTION = "Provides translations for the 'kdesdk-scripts' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only"

PV = "23.04.0"

RPM_NAME = "kdesdk-scripts-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "68217ab5de16897f4dca6ab1f7720af2b02d2389222d08221fea281cdd431c6e404b7232e56e8f965d29cc56bb4c599a7abf149b67a9d03f382a5b45760eddda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdesdk-scripts-lang kdesdk-scripts-lang-all"
RDEPENDS:${PN} += "kdesdk-scripts"

inherit rpm
