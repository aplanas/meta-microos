SUMMARY = "Command line interface and serialization format for Blosc"
DESCRIPTION = "Command line interface and serialization format for Blosc, a \
multi-threaded, blocking and shuffling compressor. It uses \
python-blosc bindings to interface with Blosc. It also comes with native \
support for serializing and deserializing Numpy arrays."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "python310-bloscpack-0.16.0-7.4.noarch.rpm"
RPM_HASH = "2d1029791ca5b82041df5f93366b71de9dbace90e142ae0953b71f9ba74f391c91f4b5230c97ecb1e6e918e095750c0fabb7440b7c57e28ecc696ea12b397516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bloscpack python3.10dist(bloscpack) python310-bloscpack python3dist(bloscpack)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-blosc python310-numpy update-alternatives"

inherit rpm
