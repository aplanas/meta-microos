SUMMARY = "Translation of man pages in Indonesian"
DESCRIPTION = "This package provides translations of man pages in Indonesian."
LICENSE = "GPL-3.0-or-later"

PV = "4.18.1"

RPM_NAME = "man-pages-id-4.18.1-1.1.noarch.rpm"
RPM_HASH = "10ec2f5139c3b7258bfcb325d8e964d8ec0050db0b822399c837e54a6d10100f2e17642cbbd9c65bab741c652b49facb14e0833258314ac2fa9b97204a60d603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(man-pages:id) man-pages-id"
RDEPENDS:${PN} += "man-pages"

inherit rpm
