SUMMARY = "Module for determining appropriate platform-specific dirs"
DESCRIPTION = "A small Python module for determining appropriate platform-specific dirs, e.g. a 'user data dir'."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python310-platformdirs-3.2.0-2.1.noarch.rpm"
RPM_HASH = "51393c6afa73f4f97d2cd00bd250684e7a1b4ab5592c18ee61a803af516473b32cb6a8c63e38ea914e26b7c2a9d57aefdadf9296a3dc6ee8ca7f9db03ae96802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-platformdirs python3.10dist(platformdirs) python310-platformdirs python3dist(platformdirs)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
