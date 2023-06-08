SUMMARY = "Meslo LG Font Family"
DESCRIPTION = "Meslo LG is a customized version of Apple's Menlo-Regular font (which is \
a customized Bitstream Vera Sans Mono)."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "meslo-lg-fonts-1.2.1-5.17.noarch.rpm"
RPM_HASH = "ef3e42304775e1ec850d0acdde6cb52168a15bf778a3995792e963ebb3324a75a43db4126925b86f8b413617de7dd2f719841e2839358f13814626898d4cdc44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "meslo-lg-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils perl"

inherit rpm
