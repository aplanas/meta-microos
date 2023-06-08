SUMMARY = "Python port of libaxolotl-android"
DESCRIPTION = "This is a Python port of libsignal-protocol-java, originally written by Moxie \
Marlinspike."
LICENSE = "GPL-3.0-only"

PV = "0.2.3"

RPM_NAME = "python39-axolotl-0.2.3-2.8.noarch.rpm"
RPM_HASH = "5bd3f4a72bd5ef3a2c315662794abe32e16a63e5f31d706f43615b9881e6cecce49edd6bd7519701e4fe1c8a5b88a9e66f67f12e50ea23a2985eb3769c978e20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-axolotl) python39-axolotl python3dist(python-axolotl)"
RDEPENDS:${PN} += "python(abi) python39-axolotl-curve25519 python39-cryptography python39-protobuf"

inherit rpm
