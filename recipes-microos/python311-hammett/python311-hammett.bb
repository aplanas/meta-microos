SUMMARY = "hammett is a fast python test runner"
DESCRIPTION = "hammett is a fast python test runner"
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python311-hammett-0.5.0-1.17.noarch.rpm"
RPM_HASH = "b54d45a1c65886eb7ee798ab27d87ac1fc06c2a8016ca190d077f1ad44b4be5b7c58e861d4ed9a93b8844880780af0c0eff554d060a444119a7674b2b4d0e1de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(hammett) python311-hammett python3dist(hammett)"
RDEPENDS:${PN} += "python(abi) python311-astunparse python311-colorama"

inherit rpm
