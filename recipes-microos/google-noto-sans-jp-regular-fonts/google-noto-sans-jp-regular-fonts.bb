SUMMARY = "Noto Sans Japanese Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular weight \
of Sans font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-regular-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "0ed1eb091732b12c7d093b59564980b263e3eadb92935a9830439400e9b56da3d50465097577f026a0d7ac0254579db778e03dffed1472543cc3b474a17b631e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-regular-fonts noto-sans-jp-regular-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
