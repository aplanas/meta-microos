SUMMARY = "Sphinx extension that automatically documents click applications"
DESCRIPTION = "A Sphinx plugin that allows to automatically extract documentation from click-based applications and include it in documentation."
LICENSE = "MIT"

PV = "4.4.0"

RPM_NAME = "python311-sphinx-click-4.4.0-1.3.noarch.rpm"
RPM_HASH = "7021c8723cc83ec413be3401c5405ad60d3dce91d38bc4265e650cefd9feaefe8049a4ac84be2f5e432b57539182e9ecebb284183da104b52a103d6a5227331f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(sphinx-click) python311-sphinx-click python3dist(sphinx-click)"
RDEPENDS:${PN} += "python(abi) python3.11dist(click) python3.11dist(docutils) python3.11dist(sphinx)"

inherit rpm
