SUMMARY = "ipdb/pdb statement checker plugin for flake8"
DESCRIPTION = "ipdb/pdb statement checker plugin for flake8"
LICENSE = "MIT"

PV = "4.1.2"

RPM_NAME = "python39-flake8-debugger-4.1.2-1.3.noarch.rpm"
RPM_HASH = "3c1ec02b5d6f913a63c2d134958ea9fd822acc588f135fb237900026e1f1fcdefa5304622be233f5e1a8314cfcf525a7086c6bf934617e2ac50c89a887be6534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(flake8-debugger) python39-flake8-debugger python3dist(flake8-debugger)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
