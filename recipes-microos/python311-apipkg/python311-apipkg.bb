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

RPM_NAME = "python311-apipkg-3.0.1-3.1.noarch.rpm"
RPM_HASH = "dd71bc05cfbe163157245ee94ef6254780440453064d79ec98b507d55090fd5ea00681b3ee816eb7f8527b873776e13bbf27dc3bff035d851e80f14c723b0bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(apipkg) python311-apipkg python3dist(apipkg)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
