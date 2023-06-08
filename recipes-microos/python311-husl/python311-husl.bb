SUMMARY = "A Python implementation of the 'Human-friendly HSL' (HSLuv) color model"
DESCRIPTION = "A Python implementation of HUSL (revision 3)."
LICENSE = "MIT"

PV = "4.0.3"

RPM_NAME = "python311-husl-4.0.3-3.17.noarch.rpm"
RPM_HASH = "9130537ce9ec7ce36a6c03b2447240541c7270ed36beea0e1a74efb9a982ec6356a673e0d118a94f4a611d89e934f831dfe8c8a7356d7c7353cd055ccfbb45f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(husl) python311-husl python3dist(husl)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
