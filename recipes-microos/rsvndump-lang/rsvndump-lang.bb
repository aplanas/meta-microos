SUMMARY = "Translations for package rsvndump"
DESCRIPTION = "Provides translations for the 'rsvndump' package."
LICENSE = "GPL-3.0-only"

PV = "0.6.1"

RPM_NAME = "rsvndump-lang-0.6.1-1.3.noarch.rpm"
RPM_HASH = "5de464d86a92f99b3d37e43eaaf1428eaff756ad3e6fca4d9b6681a9632264490fdd94dcb99539fde5cd00b8ecaf9a0ea6fa388ea62903e286007476bc02bbee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(rsvndump:de) rsvndump-lang rsvndump-lang-all"
RDEPENDS:${PN} += "rsvndump"

inherit rpm
