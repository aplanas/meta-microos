SUMMARY = "Documentation for libgpod"
DESCRIPTION = "libgpod is a library meant to abstract access to iPod content. It \
provides an API to retrieve the list of files and \
playlists stored on an iPod, modify them, and save them back to the iPod. \
 \
This package provides development documentation for libgpod."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libgpod-doc-0.8.3-12.5.noarch.rpm"
RPM_HASH = "af4c6ae3582c4531df604e2eebca6f0447347e254a1ed1eba83a5d292fa5f66ee8b33b7bf62a430b7e76ecc5d43907e079f1824d62010877fcbaa7762841f775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgpod-doc"
RDEPENDS:${PN} += ""

inherit rpm
