SUMMARY = "Translation of man pages in French"
DESCRIPTION = "This package provides translations of man pages in French."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-fr-4.18.1-1.1.noarch.rpm"
RPM_HASH = "76e9dc094195936060045926ab8266c8c09eb8fa675c0c4de9ee6393113c84642759a13ddb09ced72bbf46c6f9831a73b9968a25561cdbffb7a798b5cc2ff869"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:fr) man-pages-fr"
RDEPENDS:${PN} += "man-pages"

inherit rpm
