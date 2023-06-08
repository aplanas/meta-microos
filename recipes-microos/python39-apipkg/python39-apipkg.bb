SUMMARY = "Namespace control and lazy-import mechanism"
DESCRIPTION = "With apipkg you can control the exported namespace of a \
python package and greatly reduce the number of imports for your users. \
It is a small pure python module that works on CPython 2.7 and 3.4+, \
Jython and PyPy.  It co-operates well with Python's help() system, \
custom importers (PEP302) and common command line completion tools. \
 \
Usage is very simple: you can require 'apipkg' as a dependency or you \
can copy paste the ~200 lines of code into your project."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python39-apipkg-3.0.1-3.1.noarch.rpm"
RPM_HASH = "ffe4087b549b101f99c491b622eeea6c6e021bc5b0e21a7c11c5eebaa7181652b26bb310307acd52a7e04645e8a8a059ea5a482003730ec0d62210d4407f5681"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(apipkg) python39-apipkg python3dist(apipkg)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
