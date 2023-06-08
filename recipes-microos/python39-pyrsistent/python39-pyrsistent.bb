SUMMARY = "Persistent, Functional, Immutable data structures"
DESCRIPTION = "Pyrsistent is a number of persistent collections \
(by some referred to as functional data structures). \
Persistent in  the sense that they are immutable. \
 \
All methods on a data structure that would normally \
mutate it instead return a new copy of the structure \
containing the requested updates. The original structure \
is left untouched."
LICENSE = "MIT"

PV = "0.19.3"

RPM_NAME = "python39-pyrsistent-0.19.3-2.1.aarch64.rpm"
RPM_HASH = "ba79b4bbd8a902883d65f310bbbbc8752baa417572a54c80efa473dacb963b95d1ee7b19bdfbf877fb78a087a3fc22f6a23d0ab6e96498dd996ec9df1aa7686c"

RPROVIDES:${PN} += "python3.9dist(pyrsistent) python39-pyrsistent python39-pyrsistent(aarch-64) python3dist(pyrsistent)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
