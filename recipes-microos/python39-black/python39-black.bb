SUMMARY = "A code formatter written in, and written for Python"
DESCRIPTION = "Black is a code formatter written in Python, and reformats Python 2.x \
and 3.x code. \
 \
Black reformats entire files in place. It is not configurable. It \
does not take previous formatting into account. The coding style \
enforced is a PEP-8 subset, adheres to PEP-257, and otherwise passes \
the rules of the 'pycodestyle' checker. Black skips over blocks that \
start and end with '# fmt: off' and '# fmt: on', respectively. It \
also recognizes YAPF's block comments to the same effect."
LICENSE = "MIT"

PV = "23.3.0"

RPM_NAME = "python39-black-23.3.0-2.1.noarch.rpm"
RPM_HASH = "59f38ff9494a64fc35d7da2fc9590028a9b77dd7e41a8e84611bea34517df21b5226f77779e7d4aee9463eeac8195558c9585717e6f6bb2517252ed98edc4ca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(black) python39-black python3dist(black)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-aiohttp python39-aiohttp_cors python39-attrs python39-click python39-mypy_extensions python39-packaging python39-pathspec python39-platformdirs python39-tomli python39-typing_extensions update-alternatives"

inherit rpm
