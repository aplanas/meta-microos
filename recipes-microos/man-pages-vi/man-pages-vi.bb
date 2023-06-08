SUMMARY = "Translation of man pages in Vietnamese"
DESCRIPTION = "This package provides translations of man pages in Vietnamese."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-vi-4.18.1-1.1.noarch.rpm"
RPM_HASH = "869d6bddb5ff74ad9d361a429efcbb3971233f4411a4ecbea7f8598183ca34c684e291a5e67d8fad655b32b648b820b9fff9bdc0f4764d721b173376d96bfd67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:vi) man-pages-vi"
RDEPENDS:${PN} += "man-pages"

inherit rpm
