SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python310-affine-2.3.1-1.3.noarch.rpm"
RPM_HASH = "c04a658accaa959c2fee32984a14ff575b9bb7a06981e41d03d7e25347f785a0584bd9d69fa258123017cc0a22c33ba94f1de095b6c0b58869307aaa5ffb2f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-affine \
python3.10dist(affine) \
python310-affine \
python3dist(affine)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
