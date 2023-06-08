SUMMARY = "Python interface to Graphviz"
DESCRIPTION = "A Python wrapper for the Graphviz Agraph data structure. \
PyGraphviz can be used to create and draw networks and graphs with Graphviz."
LICENSE = "BSD-3-Clause"

PV = "1.10"

RPM_NAME = "python39-pygraphviz-1.10-1.3.aarch64.rpm"
RPM_HASH = "0ffac285320ae929395f2c43d9d1807f43f569ed2836116eec52ab66c0acfeee73ae703825348f80f248b4b18880dcbe0b5a3649671fb8698b10d917683ff218"

RPROVIDES:${PN} += "python3.9dist(pygraphviz) python39-pygraphviz python39-pygraphviz(aarch-64) python3dist(pygraphviz)"
RDEPENDS:${PN} += "graphviz ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcgraph.so.6()(64bit) libgvc.so.6()(64bit) python(abi)"

inherit rpm
