SUMMARY = "PEP517 for the Meson build system"
DESCRIPTION = "This package contains a Python module that implements PEP517 for \
the Meson build system."
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "python311-mesonpep517-0.2-1.1.noarch.rpm"
RPM_HASH = "93e2d26431413ba8c53027b42cfdca689c7d41afd730edb62a2755f35de0f8d19263c00f4ab5d3ad507b0cfcea3435ee657a0a1e4419636d24a4ffd7f0870edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mesonpep517) python311-mesonpep517 python3dist(mesonpep517)"
RDEPENDS:${PN} += "meson python(abi) python311-setuptools python311-toml python311-wheel"

inherit rpm
