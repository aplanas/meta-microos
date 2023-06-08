SUMMARY = "Patch the inner source of python functions at runtime"
DESCRIPTION = "Patch the inner source of python functions at runtime."
LICENSE = "BSD-3-Clause"

PV = "2.6.0"

RPM_NAME = "python311-patchy-2.6.0-1.3.noarch.rpm"
RPM_HASH = "66b210643ecc40ac68fab493b4fbd593f364f0700d6806c618ef682de1c2b10fb32a76d031d48b8adc8858d09ba0320cde17caf2c10715f6ecddc6a9c70df794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(patchy) python311-patchy python3dist(patchy)"
RDEPENDS:${PN} += "python(abi) python311-pkgutil-resolve-name"

inherit rpm
