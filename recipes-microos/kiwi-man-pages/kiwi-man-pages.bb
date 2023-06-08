SUMMARY = "KIWI - manual pages"
DESCRIPTION = "Provides manual pages to describe the kiwi commands"
LICENSE = "GPL-3.0-or-later"

PV = "9.24.57"

RPM_NAME = "kiwi-man-pages-9.24.57-1.2.aarch64.rpm"
RPM_HASH = "717c2eff84f8816038378af4423dec80a7a4b1b93882d7ef2814fd639dd3ff99d5cd8e19ebfab1fc0e05d7229557b4b8d628bffd04b127226612bc6d6cb53989"

RPROVIDES:${PN} += "config(kiwi-man-pages) kiwi-man-pages kiwi-man-pages(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
