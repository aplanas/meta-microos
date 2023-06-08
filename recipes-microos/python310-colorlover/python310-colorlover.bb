SUMMARY = "Color scales for Python"
DESCRIPTION = "Tools to create various types of color scales in various color formats."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-colorlover-0.3.0-1.14.noarch.rpm"
RPM_HASH = "85788b4227d24ad98edaf9a5d30ce11fcf1714bf4c838904d4316be85a21a1b88c6d875101c0854a61eeb1faa10b9ed4d4577096ee5a3463eca6e7e21e6e1d5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorlover python3.10dist(colorlover) python310-colorlover python3dist(colorlover)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
