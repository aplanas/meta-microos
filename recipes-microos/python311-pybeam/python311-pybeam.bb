SUMMARY = "Python module to parse Erlang BEAM files"
DESCRIPTION = "Python module to parse Erlang BEAM files, now it is able to read \
imports, exports, atoms, as well as compile info and attribute \
chunks in pretty python format."
LICENSE = "MIT"

PV = "0.7"

RPM_NAME = "python311-pybeam-0.7-1.11.noarch.rpm"
RPM_HASH = "f12988f621d6d03b3f26f1ea13adb5f20ac1d7d7e8df6be179f2f9c1f60bc520b2deeedaef23a47e9cf7d4868c73cc52f9cee1c3e49d79aca598598fc48abd57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybeam) python311-pybeam python3dist(pybeam)"
RDEPENDS:${PN} += "python(abi) python311-construct python311-six"

inherit rpm
