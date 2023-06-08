SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python311-MouseInfo-0.1.3-1.12.noarch.rpm"
RPM_HASH = "2df1af248d073efbb6f8f7a1c99f4cb73d62b0bf7d596e26ca414ffbe1791cb005ac7f3fe42359f20673c36725cd470fa7def793cc5823209a7d0ca0cf8ff6ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mouseinfo) python311-MouseInfo python3dist(mouseinfo)"
RDEPENDS:${PN} += "python(abi) python311-Pillow python311-pyperclip"

inherit rpm
