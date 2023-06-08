SUMMARY = "Python module to sign JSON with Ed25519 signatures"
DESCRIPTION = "Features: \
 \
* More than one entity can sign the same object. \
* Each entity can sign the object with more than one key making it easier to \
  rotate keys \
* ED25519 can be replaced with a different algorithm. \
* Unprotected data can be added to the object under the 'unsigned' key."
LICENSE = "Apache-2.0"

PV = "1.1.4"

RPM_NAME = "python39-signedjson-1.1.4-2.2.noarch.rpm"
RPM_HASH = "9556f462b6e6d394cc77ce8350371e172b6982f00e8ab73dae112f9b3c767a7ec8b06fd560656c73932a41b49b5fb24e0500cca9df5143faf96b0e4fba3c4bb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(signedjson) python39-signedjson python3dist(signedjson)"
RDEPENDS:${PN} += "python(abi) python39-PyNaCl python39-canonicaljson python39-importlib-metadata python39-typing_extensions python39-unpaddedbase64"

inherit rpm
