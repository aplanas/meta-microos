SUMMARY = "HMAC-based Extract-and-Expand Key Derivation Function (HKDF)"
DESCRIPTION = "This module implements the HMAC Key Derivation function."
LICENSE = "BSD-3-Clause"

PV = "0.0.3"

RPM_NAME = "python39-hkdf-0.0.3-2.17.noarch.rpm"
RPM_HASH = "c6b99e464e4e2f1bdde15f2e9b32b112a2d9dc7deab7deae0240561673638284452862a0d2add0eeaef7d2b504d9455d73dbfbfa7f11419973f6b22b353d3dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(hkdf) python39-hkdf python3dist(hkdf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
