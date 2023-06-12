SUMMARY = "A wrapper around the stdlib `tokenize` which roundtrips"
DESCRIPTION = "A wrapper around the stdlib `tokenize` which roundtrips."
LICENSE = "MIT"

PV = "4.2.1"

RPM_NAME = "python311-tokenize-rt-4.2.1-1.9.noarch.rpm"
RPM_HASH = "36b6a09748b7dccdb0704a5fedc9186a0891f6a78c34707490361634714543bfbbc04d28dca3bac0b5223e4e094de46b81829e01d6452b2d1ac10878bc9b9edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tokenize-rt) \
python311-tokenize-rt \
python3dist(tokenize-rt)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
update-alternatives"

inherit rpm
