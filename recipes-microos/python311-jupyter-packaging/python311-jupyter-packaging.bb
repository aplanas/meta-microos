SUMMARY = "Jupyter Packaging Utilities"
DESCRIPTION = "This package contains utilities for making Python packages \
with and without accompanying JavaScript packages"
LICENSE = "BSD-3-Clause"

PV = "0.12.3"

RPM_NAME = "python311-jupyter-packaging-0.12.3-2.2.noarch.rpm"
RPM_HASH = "1ca9eabed51f3fbdeace88a3c2581cf56825cd272fb1052f9b0a0b74fdec5bb8332bc792663657ddf5d69e74ef9e288e2b4ed07c14d279afbc15428624020331"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jupyter-packaging) python311-jupyter-packaging python311-jupyter_packaging python3dist(jupyter-packaging)"
RDEPENDS:${PN} += "python(abi) python311-deprecation python311-packaging python311-setuptools python311-tomlkit python311-wheel"

inherit rpm
