SUMMARY = "installer and related files needed on dvd1"
DESCRIPTION = "This package contains kernel, initrd and installation images \
needed on the first product dvds to start an installation."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "skelcd-installer-openSUSE-17.87-1.8.aarch64.rpm"
RPM_HASH = "b0e277280dbed19afcfdb784d875a6334da3ba7bbf14deb4f7f7ee173dfd66597454c5efac2254deeb3924b726d2773b4c9c87c25a211662035d6d70b99028e1"

RPROVIDES:${PN} += "skelcd-installer skelcd-installer-openSUSE skelcd-installer-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
