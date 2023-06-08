SUMMARY = "Headers and source files for developing with ldas-tools-al"
DESCRIPTION = "This package provides the headers and sources needed for developing programs using ldas-tools-al - LDAS tools abstraction toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.4"

RPM_NAME = "ldas-tools-al-devel-2.6.4-1.13.aarch64.rpm"
RPM_HASH = "0d321c9aa5dc1092bb7b173a0492965d05ed56801dd1ad40e7a8c6724fe71d9a8365e846e94d7375f66282ffb9b173ce81af590839fab0447fdc654538fca10d"

RPROVIDES:${PN} += "ldas-tools-al-devel ldas-tools-al-devel(aarch-64) pkgconfig(ldastoolsal)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libldastoolsal7"

inherit rpm
