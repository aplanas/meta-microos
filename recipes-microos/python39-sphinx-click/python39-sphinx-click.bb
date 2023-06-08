SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python39-sphinx-click-4.4.0-1.3.noarch.rpm"
RPM_HASH = "871bfee8656e92e4ab9b486fd88468a5661b2e450cadf0b0210f9db73194a00b3a18a99629013615fbf9fd16f19b38dec48f10c975baa6fa3481040eeee7f33d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sphinx-click) python39-sphinx-click python3dist(sphinx-click)"
RDEPENDS:${PN} += "python(abi) python3.9dist(click) python3.9dist(docutils) python3.9dist(sphinx)"

inherit rpm
