SUMMARY = "Plymouth 'Spinner' theme"
DESCRIPTION = "This package contains the 'spinner' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-spinner-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "2d029522d29011bf2019a13e3b597b06c0c461fd955c18f4b28b73a9b2ceacea46a36c26fae02b95413ea1b8abf78bb291ecde084d8b7b9c21480df3c4fbb213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-spinner"
RDEPENDS:${PN} += "plymouth-plugin-two-step plymouth-scripts"

inherit rpm
