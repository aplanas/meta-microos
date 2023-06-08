SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-hatch_vcs-0.3.0-4.1.noarch.rpm"
RPM_HASH = "3f37d2a7875f46bbcefefd803dcc09442bf9758412e46b30b4f53a87df9f7d050608f45aa91734dadcea3a070f6c105f0d9e0fbce3fa54f6adb554d016dd3226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hatch-vcs) python39-hatch-vcs python39-hatch_vcs python3dist(hatch-vcs)"
RDEPENDS:${PN} += "(python39-setuptools_scm >= 6.4.0) python(abi) python39-hatchling"

inherit rpm
