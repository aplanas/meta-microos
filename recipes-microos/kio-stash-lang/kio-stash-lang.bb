SUMMARY = "Translations for package kio-stash"
DESCRIPTION = "Provides translations for the 'kio-stash' package."
LICENSE = "GPL-2.0+"

PV = "1.0"

RPM_NAME = "kio-stash-lang-1.0-1.29.noarch.rpm"
RPM_HASH = "d9f7f981e945df5aabda3b9356aae88f4a41f2134af73a75b6340e779049457a5d5ac0a84e3cc696f25ac6a7bdeec31cb2c3702f2289eea1158809a01f657318"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kio-stash-lang kio-stash-lang-all"
RDEPENDS:${PN} += "kio-stash"

inherit rpm
