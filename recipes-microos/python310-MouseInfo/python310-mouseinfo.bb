SUMMARY = "Display XY position and RGB color information for pixels"
DESCRIPTION = "This application to display XY position and RGB color information for the pixel \
currently under the mouse. Works on Python 2 and 3. This is useful for GUI \
automation planning."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.3"

RPM_NAME = "python310-MouseInfo-0.1.3-1.12.noarch.rpm"
RPM_HASH = "a609297f469c79c58379c5458def6d07195d278d85f99941399e58739eaee55ca5903fa599d265cf15da718009a1b8f1e3a60428e29fa0dc6e94ef696f5d589f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MouseInfo \
python3.10dist(mouseinfo) \
python310-MouseInfo \
python3dist(mouseinfo)"
RDEPENDS:${PN} += "python(abi) \
python310-Pillow \
python310-pyperclip"

inherit rpm
