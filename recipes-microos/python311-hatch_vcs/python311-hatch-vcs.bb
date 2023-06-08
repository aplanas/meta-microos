SUMMARY = "Hatch plugin for versioning with your preferred VCS"
DESCRIPTION = "This provides a plugin for Hatch that uses your preferred version control system (like Git) to determine project versions."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-hatch_vcs-0.3.0-4.1.noarch.rpm"
RPM_HASH = "24372d1129f66abb4ec216aafd953e8d1063a3e6ff895ade033c20a0c9267cd31e3d188f575617e1af4ce0092bf0a2f5f5dd126c76966bd260298bb7da03592f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hatch-vcs) python311-hatch-vcs python311-hatch_vcs python3dist(hatch-vcs)"
RDEPENDS:${PN} += "(python311-setuptools_scm >= 6.4.0) python(abi) python311-hatchling"

inherit rpm
