SUMMARY = "Polyfill package for Flake8 plugins"
DESCRIPTION = "Flake8-polyfill is a package that provides some compatibility helpers for \
Flake8 plugins that intend to support Flake8 2.x and 3.x simultaneously."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "python39-flake8-polyfill-1.0.2-3.8.noarch.rpm"
RPM_HASH = "7e0c4dbd78e48141e716cc53c958434f9366ce77b78dbfbfaea1d8fbc72fa24417c7e81ef1c9b41d9ee1bec62f7674c4141a46e7f8ceb2dbb2d1f06d7326907d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-polyfill) python39-flake8-polyfill python3dist(flake8-polyfill)"
RDEPENDS:${PN} += "python(abi) python39-flake8"

inherit rpm
