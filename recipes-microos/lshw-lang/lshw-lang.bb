SUMMARY = "Translations for package lshw"
DESCRIPTION = "Provides translations for the 'lshw' package."
LICENSE = "GPL-2.0-only"

PV = "B.02.19.2+git.20230320"

RPM_NAME = "lshw-lang-B.02.19.2+git.20230320-1.1.noarch.rpm"
RPM_HASH = "c8364181b60fb49f8362a466eb1330d0ca01691f63cb914b9352fb9f9f9ddc78fd5c3ac08caf3b42d2a4f07a74c8a4d1ef1decc7d160743a9bc03d0d694f70db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(lshw:ca) locale(lshw:es) locale(lshw:fr) lshw-lang lshw-lang-all"
RDEPENDS:${PN} += "lshw"

inherit rpm
