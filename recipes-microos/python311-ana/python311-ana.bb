SUMMARY = "The Python 'ana' module"
DESCRIPTION = "A Python module that provides an undocumented data layer for Python objects."
LICENSE = "BSD-2-Clause"

PV = "0.06"

RPM_NAME = "python311-ana-0.06-3.3.noarch.rpm"
RPM_HASH = "8f4f258e982cf061daa7721238cb0049326edb6cb58326e2159e871fec40eeb41c3bfdfaafdac4f14005e846e80fe64246f7271ca741cdeddefefb50a904b897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ana) \
python311-ana \
python3dist(ana)"
RDEPENDS:${PN} += "python(abi) \
python311-future"

inherit rpm
