SUMMARY = "A YAML parser and emitter written in C"
DESCRIPTION = "This package holds the shared library of libyaml."
LICENSE = "MIT"

PV = "0.2.5"

RPM_NAME = "libyaml-0-2-0.2.5-2.3.aarch64.rpm"
RPM_HASH = "bfe4399cf64163f11cecf66e573ca15fcde1e165110b4e366833fcc0763d9cf6192c86961c17303fde2992b6cafca2b1f379afbed91503ce1700cf5bb16b1795"

RPROVIDES:${PN} += "libyaml-0-2 libyaml-0-2(aarch-64) libyaml-0.so.2()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
