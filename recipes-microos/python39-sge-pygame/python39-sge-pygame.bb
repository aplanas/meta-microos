SUMMARY = "A 2-D game engine for Python"
DESCRIPTION = "The SGE Game Engine is a general-purpose 2-D game engine. It takes \
care of several details, such as window size management, collision \
detection, parallax scrolling, image transformation. \
 \
This implementation of the SGE uses Pygame as a backend."
LICENSE = "LGPL-3.0-or-later"

PV = "1.7.1"

RPM_NAME = "python39-sge-pygame-1.7.1-1.7.noarch.rpm"
RPM_HASH = "41874625bc55fe701cac0db7654896546bb4bdb679bc4208db1b0dc9a21e17462bff6d404f4c0391e27d3a532ba28887f7f34b9a9eaea2dee4f48cce243b4ba3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sge) python39-sge-pygame python3dist(sge)"
RDEPENDS:${PN} += "python(abi) python39-pygame python39-six python39-uniseg"

inherit rpm
