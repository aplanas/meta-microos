SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python39-abimap"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-abimap-doc-0.3.2-3.10.noarch.rpm"
RPM_HASH = "fa75536950defc15a906ff3d6a4098f3398fca75097152bc9a8004209ebc3f2f01d150e6fd2e04c012f0586c4dfdd6122f454d2cda0a2c59bd63b8c72a9e4a34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-abimap-doc"
RDEPENDS:${PN} += ""

inherit rpm
