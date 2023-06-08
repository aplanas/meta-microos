SUMMARY = "An interative animation framework for matplotlib"
DESCRIPTION = "An interative animation framework for matplotlib"
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "python310-mpl-animators-1.0.1-1.6.noarch.rpm"
RPM_HASH = "a029da45208eb12038942d0ab706b77a1a0d8c84afc72b8b44a8d7c7853d3239037eb39d8968cea15425ab80253d38799970add7e9fdb6d926492a11cb263b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpl-animators python3-mpl_animators python3.10dist(mpl-animators) python310-mpl-animators python310-mpl_animators python3dist(mpl-animators)"
RDEPENDS:${PN} += "python(abi) python310-matplotlib python310-numpy"

inherit rpm
