SUMMARY = "Git Object Database"
DESCRIPTION = "GitDB is a pure-Python git object database"
LICENSE = "BSD-3-Clause"

PV = "4.0.10"

RPM_NAME = "python311-gitdb-4.0.10-2.1.aarch64.rpm"
RPM_HASH = "79275587ab2389a3bafc7f2eb5f31b5a911c8fb26a25153d0c2961d17301b3ff5970c402b20cfe1dc6819803bc46f209bf783d88913b6e613c7bafdee5d65102"

RPROVIDES:${PN} += "python3.11dist(gitdb) \
python311-gitdb \
python311-gitdb(aarch-64) \
python311-gitdb2 \
python3dist(gitdb)"
RDEPENDS:${PN} += "python(abi) \
python311-smmap"

inherit rpm
