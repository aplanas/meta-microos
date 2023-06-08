SUMMARY = "Design of experiments for Python"
DESCRIPTION = "The pyDOE2 package is a fork of the pyDOE package that is designed to \
help the scientist, engineer, statistician, etc., to construct \
appropriate experimental designs. \
 \
This fork came to life to solve bugs and issues that remained unsolved in the \
original package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "python39-pyDOE2-1.3.0-2.9.noarch.rpm"
RPM_HASH = "7144e5b4ed2b4bc222bbc36a4351a56b9f198be71d177b4a04944516d697022dcbf5c62fb662aa34295da0046c855afe0ee1dd4c972ff46fbdacca1c60d89c21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydoe2) python39-pyDOE2 python3dist(pydoe2)"
RDEPENDS:${PN} += "python(abi) python39-numpy python39-scipy"

inherit rpm
