SUMMARY = "PDF and image viewer optimized for presentations"
DESCRIPTION = "Impressive is a program that displays presentation slides. \
Features: \
- Page transitions \
- Overview screen \
- Highlight boxes \
- Spotlight effect"
LICENSE = "GPL-2.0-only"

PV = "0.13.1"

RPM_NAME = "impressive-0.13.1-1.5.noarch.rpm"
RPM_HASH = "84ff618d4d2438ea22a780db046b4d8a3519d6cc0a283b8a7913fd9cb13367d9f47c83b1358cb6b2556e81dfa2c96d6081e4762a9e6e264651fda5a9b024fe02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "impressive"
RDEPENDS:${PN} += "/usr/bin/python3 ghostscript python3-imaging python3-opengl python3-pygame"

inherit rpm
