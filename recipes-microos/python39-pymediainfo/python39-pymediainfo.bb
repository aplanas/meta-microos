SUMMARY = "Python wrapper for the mediainfo library"
DESCRIPTION = "This module is a Python wrapper for the mediainfo library."
LICENSE = "MIT"

PV = "6.0.1"

RPM_NAME = "python39-pymediainfo-6.0.1-2.2.noarch.rpm"
RPM_HASH = "caf9cc2f6b9d87d0758ab1427498bbc77031747d1fd4ffde69c3304fb8e22e3c7044be78a2799cc10cb10e2a25a5768127ddc978369e3921921405c4ed766b29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pymediainfo) python39-pymediainfo python3dist(pymediainfo)"
RDEPENDS:${PN} += "libmediainfo0 python(abi)"

inherit rpm
