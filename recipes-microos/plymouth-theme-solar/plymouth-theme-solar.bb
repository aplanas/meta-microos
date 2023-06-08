SUMMARY = "Plymouth 'Solar' theme"
DESCRIPTION = "This package contains the 'Solar' boot splash theme for \
Plymouth. It features a blue flamed sun with animated solar flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-solar-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "7a3f2391be51973b8c54be9fc2145747da40a2d6bd5614c2d3e7f62967f592026f89eed6719d5d4aa09ae2dfc3b4857606b31e84e44a97f07d4e940fd3270aef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-solar"
RDEPENDS:${PN} += "/bin/sh plymouth-plugin-space-flares plymouth-scripts"

inherit rpm
