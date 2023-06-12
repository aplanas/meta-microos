SUMMARY = "MATE icon theme"
DESCRIPTION = "This package contains the default icon theme used by the MATE desktop. \
The icons are used in the panel menu, and in nautilus and other \
applications, to represent the different applications, files, \
directories, and devices."
LICENSE = "CC-BY-3.0 & LGPL-3.0-only"

PV = "1.26.0"

RPM_NAME = "mate-icon-theme-1.26.0-1.6.noarch.rpm"
RPM_HASH = "e02aed55ffa6d87b6a05c79f2ce03376ac3986409223aa376b4940977500ed0340aab5a1961c74d8b00ad2c5f71876044ccda3022eb05ffbd85f5633d407285b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-icon-theme \
mate-icon-theme-devel"
RDEPENDS:${PN} += ""

inherit rpm
