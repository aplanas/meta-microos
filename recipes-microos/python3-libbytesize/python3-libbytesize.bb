SUMMARY = "Python 3 bindings for LibBytesize"
DESCRIPTION = "This package contains Python 3 bindings for LibBytesize making the use of \
the library from Python 3 easier and more convenient."
LICENSE = "LGPL-2.1-only"

PV = "2.8"

RPM_NAME = "python3-libbytesize-2.8-1.1.aarch64.rpm"
RPM_HASH = "c4a6b1a572a81b5319a02ade5d6c2b6b3acffbb62bb1d6ad54d61be6bbbd0d3d8368cd37c008ff7121fc6f3cdc4c29ea7f46fd62c60a7871f1e368e91c038ea5"

RPROVIDES:${PN} += "python3-libbytesize \
python3-libbytesize(aarch-64)"
RDEPENDS:${PN} += "libbytesize1 \
python(abi) \
python3-six"

inherit rpm
