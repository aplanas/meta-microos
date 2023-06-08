SUMMARY = "The Enlightenment GTK theme -- Common Files"
DESCRIPTION = "The dark GTK2/GTK3 theme with sharp corners, which is designed for use in \
Enlightenment and gives the elegant look of Enlightenment to GTK widgets. \
 \
This package provides the common files to the GTK+ themes."
LICENSE = "GPL-3.0"

PV = "3.22.2"

RPM_NAME = "metatheme-e17gtk-common-3.22.2-1.11.noarch.rpm"
RPM_HASH = "a0dc16ed125e8b57df847fb2211ca921a4f77acab7c7cb08136c19041acfeb14cc76ded48b84d8075e70a70230510a7b1fa0edf4a52e7d4d9eaa2d64ca12590c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-e17gtk-common"
RDEPENDS:${PN} += ""

inherit rpm
