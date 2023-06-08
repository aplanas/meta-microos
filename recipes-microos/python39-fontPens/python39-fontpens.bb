SUMMARY = "A collection of classes implementing the pen protocol for manipulating glyphs"
DESCRIPTION = "A collection of classes implementing the pen protocol for manipulating glyphs."
LICENSE = "BSD-3-Clause"

PV = "0.2.4"

RPM_NAME = "python39-fontPens-0.2.4-5.7.noarch.rpm"
RPM_HASH = "2e840b73e522c6acd10ce832d0631e9b3fb7a91d3587e2f01c923e43b62601fde99a46e7603260f6f0c6460633a6c64e27a1df77ae9c1a914561f98f5dff0833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fontpens) python39-fontPens python3dist(fontpens)"
RDEPENDS:${PN} += "python(abi) python39-FontTools"

inherit rpm
