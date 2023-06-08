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

RPM_NAME = "python311-pyrsistent-0.19.3-2.1.aarch64.rpm"
RPM_HASH = "3aa558672e8e86d11fe4566d0e7ab371965c44b8a52b78dbfe99e1c4b27c96e9409d0c1169277c5ff49ab43eb5a73c90694b3577b51bd04e71e2793c7c54d7a6"

RPROVIDES:${PN} += "python3.11dist(pyrsistent) python311-pyrsistent python311-pyrsistent(aarch-64) python3dist(pyrsistent)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
