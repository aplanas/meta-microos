SUMMARY = "Thin wrapper for pandoc"
DESCRIPTION = "pypandoc provides a thin wrapper for pandoc, a universal document converter."
LICENSE = "MIT"

PV = "1.11"

RPM_NAME = "python310-pypandoc-1.11-1.1.noarch.rpm"
RPM_HASH = "d23495264a622769139df41549d66a4a945e72c44564973322ff12df1a135b9e5919c73a33e30da58a7bc9c83e6472ef1b2a34c26b5861c58463ea1e13bf2f65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypandoc python3.10dist(pypandoc) python310-pypandoc python3dist(pypandoc)"
RDEPENDS:${PN} += "pandoc python(abi) python310-pip python310-wheel"

inherit rpm
