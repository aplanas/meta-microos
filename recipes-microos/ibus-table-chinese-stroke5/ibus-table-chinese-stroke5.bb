SUMMARY = "Stroke 5 input method"
DESCRIPTION = "Stroke 5 input method."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.12"

RPM_NAME = "ibus-table-chinese-stroke5-1.8.12-1.1.noarch.rpm"
RPM_HASH = "1d7ddb02a5cc2e9a4cfe135e33705c4c3b74594e09ed43ce137ed3167f4012af2d7a2d30ecc15425f78d7097d0235e3b2c010ee3a3677039305bdaafadfc7f36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-chinese-stroke5 \
ibus-table-stroke5 \
locale(ibus:zh_CN)"
RDEPENDS:${PN} += "/bin/sh \
ibus-table"

inherit rpm
