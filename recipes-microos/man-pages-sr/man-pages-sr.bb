SUMMARY = "Translation of man pages in Serbian"
DESCRIPTION = "This package provides translations of man pages in Serbian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-sr-4.18.1-1.1.noarch.rpm"
RPM_HASH = "191dfcfc3fa68b02150bbd4a47ae688f7b3ad135872e24bf3dce225842d899b1e4dbf5c260b3804905919d549c1793a6aa4dc00eda79e3b240b779e2fb7f8889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:sr) man-pages-sr"
RDEPENDS:${PN} += "man-pages"

inherit rpm
