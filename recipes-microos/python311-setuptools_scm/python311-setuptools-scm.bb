SUMMARY = "Python setuptools handler for SCM tags"
DESCRIPTION = "The setuptools_scm package handles managing one's Python package versions \
in SCM metadata. It also handles file finders for the supperted SCMs."
LICENSE = "MIT"

PV = "7.0.5"

RPM_NAME = "python311-setuptools_scm-7.0.5-2.1.noarch.rpm"
RPM_HASH = "2d9c51707c6620b0902040ef068fe46da51262a21841abd4c2d71d1a5843a1d7fa6a1956be25762714b09bac4a9e5ca184f5dd8559fa009a21e326d1e2b0e4e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-scm) python311-setuptools_scm python3dist(setuptools-scm)"
RDEPENDS:${PN} += "python(abi) python311-packaging python311-setuptools python311-tomli python311-typing-extensions"

inherit rpm
