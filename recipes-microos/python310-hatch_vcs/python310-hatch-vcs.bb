SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-hatch_vcs-0.3.0-4.1.noarch.rpm"
RPM_HASH = "723171d269384dfb711c6176bdd0ae1819ab3a4f576c55aec831788c5420e011afd92c73d4e3068dfa6a920510bd2beae4dddd165b17bd9b25ebcdc47ef59f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-hatch-vcs python3-hatch_vcs python3.10dist(hatch-vcs) python310-hatch-vcs python310-hatch_vcs python3dist(hatch-vcs)"
RDEPENDS:${PN} += "(python310-setuptools_scm >= 6.4.0) python(abi) python310-hatchling"

inherit rpm
