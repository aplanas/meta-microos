SUMMARY = "Documentation for python-bpython"
DESCRIPTION = "Documentation and help files for python-bpython."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-doc-0.24-1.4.noarch.rpm"
RPM_HASH = "f2006d497688d3fe524b5e5ffeec36ba3153e97298e346d4c1b550d4a9bf017dad2026558ffdae7b6a7cebbe38f6e6be13ee2d01645db10fdd0526839ea09804"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-doc python310-bpython-doc python311-bpython-doc python39-bpython-doc"
RDEPENDS:${PN} += ""

inherit rpm
