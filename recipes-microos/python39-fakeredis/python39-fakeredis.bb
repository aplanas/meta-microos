SUMMARY = "Fake implementation of redis API for testing purposes"
DESCRIPTION = "Fake implementation of redis API for testing purposes."
LICENSE = "BSD-3-Clause & MIT"

PV = "2.10.3"

RPM_NAME = "python39-fakeredis-2.10.3-2.1.noarch.rpm"
RPM_HASH = "2272bc48a1c7aaae7a5a87848c04217c33085a9a917ad81b1670a23fa3d2519e6812d9c1f6c5a69a89146e9f15a672d2bfcea85d554605342dc4ba3400ecfdd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(fakeredis) python39-fakeredis python3dist(fakeredis)"
RDEPENDS:${PN} += "python(abi) python39-redis python39-sortedcontainers"

inherit rpm
