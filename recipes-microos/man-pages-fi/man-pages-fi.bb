SUMMARY = "Translation of man pages in Finnish"
DESCRIPTION = "This package provides translations of man pages in Finnish."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-fi-4.18.1-1.1.noarch.rpm"
RPM_HASH = "81ad93234700a2a0f0df7d4233cc55b81b8a32360c6c276f5380cb94038882f86c224bf58942a3dfe123226e3bf1e030e11100d69382f12db18008c85448c973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:fi) man-pages-fi"
RDEPENDS:${PN} += "man-pages"

inherit rpm
