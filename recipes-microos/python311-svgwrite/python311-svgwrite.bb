SUMMARY = "Python module for creating SVG drawings"
DESCRIPTION = "A Python library to create SVG drawings."
LICENSE = "MIT"

PV = "1.4.3"

RPM_NAME = "python311-svgwrite-1.4.3-1.3.noarch.rpm"
RPM_HASH = "cc6951586c3b49e645249d0ad0f3457634297bb1fbd58e415695d9c16c3b082c287ada5a39fa01da67b0e56ea5f288f491809ffe4bbaca175297e0f6eaddf2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(svgwrite) python311-svgwrite python3dist(svgwrite)"
RDEPENDS:${PN} += "python(abi) python311-pyparsing"

inherit rpm
