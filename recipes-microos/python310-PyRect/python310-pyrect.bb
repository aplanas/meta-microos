SUMMARY = "Rect class for Pygame-like rectangular areas"
DESCRIPTION = "PyRect is a simple module with a Rect class for Pygame-like rectangular areas."
LICENSE = "BSD-3-Clause"

PV = "0.2.0"

RPM_NAME = "python310-PyRect-0.2.0-1.3.noarch.rpm"
RPM_HASH = "5190727a4d2303d280850ba1b85f9258e1f0a8f29fe9eee75fc85077ffeef5b3fa0fd393c36549a8a5d736c41bd3c6dc113dc1da7c2cb2c15971f7af16975ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyRect python3.10dist(pyrect) python310-PyRect python3dist(pyrect)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
