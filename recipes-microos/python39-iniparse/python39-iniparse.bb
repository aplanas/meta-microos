SUMMARY = "Python Module for Accessing and Modifying Configuration Data in INI files"
DESCRIPTION = "iniparse is an INI parser for Python which is API compatible with the \
standard library's ConfigParser, preserves structure of INI files \
(order of sections & options, indentation, comments, and blank lines \
are preserved when data is updated), and is more convenient to use."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python39-iniparse-0.5-4.3.noarch.rpm"
RPM_HASH = "ed46014340751052834aff768c963d406e363b5fd5ec58385ab5b13b976c404608800ab575e34fa4bde5e1a2b5d214554d87e2dcfeef26e0097b76b2217e1827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(iniparse) python39-iniparse python3dist(iniparse)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
