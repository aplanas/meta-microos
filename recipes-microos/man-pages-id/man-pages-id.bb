SUMMARY = "Translation of man pages in Indonesian"
DESCRIPTION = "This package provides translations of man pages in Indonesian."
LICENSE = "GPL-3.0-or-later"

PV = "4.19.0"

RPM_NAME = "man-pages-id-4.19.0-1.1.noarch.rpm"
RPM_HASH = "b21a7d8f11f4342e58bb49568737046acd82c61120a6a693212db84566852a7ade1dfab14da2e526e7c8aa7a112995901a495cc903d12e70d08b503f31bfc903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:id) man-pages-id"
RDEPENDS:${PN} += "man-pages"

inherit rpm
