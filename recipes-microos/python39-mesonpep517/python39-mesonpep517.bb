SUMMARY = "PEP517 for the Meson build system"
DESCRIPTION = "This package contains a Python module that implements PEP517 for \
the Meson build system."
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "python39-mesonpep517-0.2-1.1.noarch.rpm"
RPM_HASH = "55ebeb2c0390a493e476464fc4ca090167ab73d9943eb1f96bfb2d8a05d456d1e10759bb637370cf8f7f83615a9192b556545318cc03601257a1b956c6ca7699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mesonpep517) python39-mesonpep517 python3dist(mesonpep517)"
RDEPENDS:${PN} += "meson python(abi) python39-setuptools python39-toml python39-wheel"

inherit rpm
