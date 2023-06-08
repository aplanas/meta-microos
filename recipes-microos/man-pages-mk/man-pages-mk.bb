SUMMARY = "Translation of man pages in Macedonian"
DESCRIPTION = "This package provides translations of man pages in Macedonian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-mk-4.18.1-1.1.noarch.rpm"
RPM_HASH = "c9ecd99bcff0bebffb9cac99973d48c2955cf2d4b0573987019944f4cd3afb2dc60ef8f3378debea94ab300db13037557be8e8846a8ed7be1c369b1063e10063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:mk) man-pages-mk"
RDEPENDS:${PN} += "man-pages"

inherit rpm
