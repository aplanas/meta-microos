SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python310-patchy-2.6.0-1.3.noarch.rpm"
RPM_HASH = "c76a517d07c52a163ebdbc81d9878bdb6dfea8805c357720d4497bc6c18e2acd5399709e14c3ec6004f7ebd18156e05c3cc8c5ae10844b5b0526f233c97c929c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-patchy python3.10dist(patchy) python310-patchy python3dist(patchy)"
RDEPENDS:${PN} += "python(abi) python310-pkgutil-resolve-name"

inherit rpm
