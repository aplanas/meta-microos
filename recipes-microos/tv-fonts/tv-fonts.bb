SUMMARY = "Fonts for TV Applications"
DESCRIPTION = "This package includes some X Window System bitmap fonts for TV \
applications:  large fonts frequently used in on-screen displays, \
teletext font, and more."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "tv-fonts-1.1-449.14.noarch.rpm"
RPM_HASH = "f2e2b9e42738b8083b0d513f90f03c34bd8f5dc690daea66ebe0d5f874f4c454116c7d7c9a5d2b0e1fdbb6ab9c148a390784fed1f3af2f3531f5dd7d6dc41d3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tv-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
