SUMMARY = "PAM interface using ctypes"
DESCRIPTION = "PAM interface using ctypes."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-pamela-1.0.0-1.13.noarch.rpm"
RPM_HASH = "5a1c6efe3e0767d3574aa8f8bbd2b97323de2955a6197303e1f34b1c0279e14e50b7bbe4ee3b9ee9176526f8b96f02a5db0ce8e29037b5b564f48e072d616aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pamela) python311-pamela python3dist(pamela)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
