SUMMARY = "Streaming JSON parser with iterator interface"
DESCRIPTION = "JsonSlicer performs a stream or iterative, pull JSON parsing, which \
means it does not load whole JSON into memory and is able to parse \
very large JSON files or streams. The module is written in C and uses \
YAJL JSON parsing library. \
 \
JsonSlicer takes a path of JSON map keys or array indexes, and \
provides iterator interface which yields JSON data matching \
given path as complete Python objects."
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python39-jsonslicer-0.1.8-1.4.aarch64.rpm"
RPM_HASH = "9d0580a0f044b1f0873d5ec329c28a9203e6388cb6bac00a15cc81dfddc2cefc82e27e1d872737552d5654363d049399bc2efb2d2779c2e908cf17c5ce952749"

RPROVIDES:${PN} += "python3.9dist(jsonslicer) python39-jsonslicer python39-jsonslicer(aarch-64) python3dist(jsonslicer)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libyajl.so.2()(64bit) python(abi)"

inherit rpm
