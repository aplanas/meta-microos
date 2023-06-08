SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.0.5"

RPM_NAME = "python310-setuptools_scm-7.0.5-2.1.noarch.rpm"
RPM_HASH = "da6c0cc32e577171aab7f2299e05648884ef8f2ff36491812f60b3ca990777eb9e48df3af93c1e1f98dcae99a44e66c00b88d90004d97f5797691eb519383431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools_scm python3.10dist(setuptools-scm) python310-setuptools_scm python3dist(setuptools-scm)"
RDEPENDS:${PN} += "python(abi) python310-packaging python310-setuptools python310-tomli python310-typing-extensions"

inherit rpm
