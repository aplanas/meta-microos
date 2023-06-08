SUMMARY = "An immutable dictionary"
DESCRIPTION = "frozendict is an immutable wrapper around dictionaries that implements the \
complete mapping interface. It can be used as a drop-in replacement for \
dictionaries where immutability is desired."
LICENSE = "MIT"

PV = "2.3.5"

RPM_NAME = "python39-frozendict-2.3.5-2.4.aarch64.rpm"
RPM_HASH = "b8cc9828f234bb4fc6e49fc02ccc31586bb7d5bc7c410d803e90b81138915e84a67d44fc22c13f0d6c2a82bd19d74133ca10ea52f7ea18c19bd65e6e16d16d19"

RPROVIDES:${PN} += "python3.9dist(frozendict) python39-frozendict python39-frozendict(aarch-64) python3dist(frozendict)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
