SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python311-sge-pygame-1.7.1-1.7.noarch.rpm"
RPM_HASH = "731a3b3978257eaee2f6590f746f4491905c8dbb862f730245855d11ad401fa1b9bda86df456f6ad3c85c52d88729fcc6fc25eaa4cbc1f34263f7f984df309b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sge) python311-sge-pygame python3dist(sge)"
RDEPENDS:${PN} += "python(abi) python311-pygame python311-six python311-uniseg"

inherit rpm
