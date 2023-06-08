SUMMARY = "Library implementing a mutable variant of namedtuple"
DESCRIPTION = "Mutable variant of namedtuple -- recordclass, which support assignments, and \
other memory saving variants."
LICENSE = "MIT"

PV = "0.18.0.1"

RPM_NAME = "python310-recordclass-0.18.0.1-1.5.aarch64.rpm"
RPM_HASH = "31c5cc23929b5c6e8a31279912355ada9423273769878c0706cafe212993fc965a2e31ed57ab9be28ffc6bbd906e672baf879cb016fc4bbb7dfcc391bafe877b"

RPROVIDES:${PN} += "python3-recordclass python3.10dist(recordclass) python310-recordclass python310-recordclass(aarch-64) python3dist(recordclass)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
