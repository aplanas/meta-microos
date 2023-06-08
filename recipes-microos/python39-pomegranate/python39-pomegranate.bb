SUMMARY = "A graphical models library for Python"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python39-pomegranate-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "0b010543b82f7189ef99ba7ffbb44ee50bc0c0fb5aacb4a698e25321075ce2e4cfed05aa0ff9b2b032b882a81b04c4f70ce5aaf4a21c4079f449652ad8b003b5"

RPROVIDES:${PN} += "python3.9dist(pomegranate) python39-pomegranate python39-pomegranate(aarch-64) python3dist(pomegranate)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-PyYAML python39-joblib python39-networkx python39-numpy python39-scipy"

inherit rpm
