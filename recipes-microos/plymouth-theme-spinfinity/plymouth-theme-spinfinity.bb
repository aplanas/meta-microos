SUMMARY = "Plymouth 'Spinfinity' theme"
DESCRIPTION = "This package contains the 'Spinfinity' boot splash theme for \
Plymouth. It features a centered logo and animated spinner that \
spins in the shape of an infinity sign."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinfinity-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "373cf2546e4e6a9449516e879935cba3d4be918ee04f1f9cd914c81b82540213366dbdfe1662127c63d91b77365e448096efaa702411dd79dbe44644129f13fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinfinity"
RDEPENDS:${PN} += "/bin/sh plymouth plymouth-scripts"

inherit rpm
