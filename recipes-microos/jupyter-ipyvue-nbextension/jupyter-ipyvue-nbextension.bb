SUMMARY = "Jupyter widgets base for Vue libraries - nbextension"
DESCRIPTION = "Jupyter widgets base for Vue libraries \
 \
This package provides the jupyter notebook extension."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "jupyter-ipyvue-nbextension-1.9.0-2.1.noarch.rpm"
RPM_HASH = "6046f5acc112da21b2d3100fd7c0879b7afd00c0ac6a21132ce15a59af1abb9de39406d817448286d45d3d53f7542c9b2f4bbad2ff4b084b747c3724631ccf3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipyvue-nbextension"
RDEPENDS:${PN} += "jupyter-notebook python3dist(ipyvue)"

inherit rpm
