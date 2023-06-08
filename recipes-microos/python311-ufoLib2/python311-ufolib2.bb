SUMMARY = "UFO font processing library"
DESCRIPTION = "ufoLib2 is a UFO font processing library."
LICENSE = "Apache-2.0"

PV = "0.13.1"

RPM_NAME = "python311-ufoLib2-0.13.1-1.3.noarch.rpm"
RPM_HASH = "3de26fc6234bdcce6fb6b8bb802a4552035cb5c3f60b768e1186cc7da1bf1df4be3c28d256227492b53d96fc617373c582d0927a5e125b182bcf62c19ddd5deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ufolib2) python311-ufoLib2 python3dist(ufolib2)"
RDEPENDS:${PN} += "python(abi) python311-FontTools python311-attrs python311-fs"

inherit rpm
