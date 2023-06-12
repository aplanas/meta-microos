SUMMARY = "A patch parsing and application library"
DESCRIPTION = "A patch parsing and application library."
LICENSE = "MIT"

PV = "1.0.3"

RPM_NAME = "python310-whatthepatch-1.0.3-1.4.noarch.rpm"
RPM_HASH = "2f3d3fc14df4420879d2371c7d1554479b0334ff1c40728bc7bc64110eb618d5b20f9d6c964821607087724a0591ad398dd9f41ffef8d3e0318398e9e74f9265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whatthepatch \
python3.10dist(whatthepatch) \
python310-whatthepatch \
python3dist(whatthepatch)"
RDEPENDS:${PN} += "ed \
patch \
python(abi)"

inherit rpm
