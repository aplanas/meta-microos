SUMMARY = "Plymouth 'Script' theme"
DESCRIPTION = "This package contains the 'script' boot splash theme for \
Plymouth. It is a simple example theme the uses the 'script' \
plugin."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-script-22.02.122+94.4bd41a3-4.1.noarch.rpm"
RPM_HASH = "686e846beac02b4493518acf3240cfb3c1bb5a369947205210deb91f1a9a5d0df74fb51b0c3d0fcd37b3a2a193c34fad81eab501fe6af11519e6995a151ed333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-script"
RDEPENDS:${PN} += "plymouth-plugin-script plymouth-scripts"

inherit rpm
