SUMMARY = "Zopfli module for python"
DESCRIPTION = "Zopfli module for python"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python39-zopfli-0.2.2-2.1.aarch64.rpm"
RPM_HASH = "bfb096637717216033f5f65f177ab53ca94b437d00e3895db687c6e5ca005ec335d57c08f93c56643dfeaeaefd28538f9ba4e293025e95a4b285a65ff98b83bd"

RPROVIDES:${PN} += "python3.9dist(zopfli) python39-zopfli python39-zopfli(aarch-64) python3dist(zopfli)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libzopfli.so.1()(64bit) libzopflipng.so.1()(64bit) python(abi)"

inherit rpm
