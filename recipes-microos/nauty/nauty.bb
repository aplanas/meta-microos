SUMMARY = "Tools for computing automorphism groups of graphs"
DESCRIPTION = "nauty and Traces are programs for computing automorphism groups of \
graphs and digraphs (*Traces does not accept digraphs at this time). \
They can also produce a canonical label. They are written in a \
portable subset of C, and run on a considerable number of different \
systems. \
 \
There is a small suite of programs called gtools included in the \
package. For example, geng can generate non-isomorphic graphs very \
quickly. There are also generators for bipartite graphs, digraphs, \
and multigraphs."
LICENSE = "Apache-2.0"

PV = "2.8.6"

RPM_NAME = "nauty-2.8.6-1.3.aarch64.rpm"
RPM_HASH = "1ff48e553178d0f1528df2ae65424d925d08cee7c98b25761e30f6859c22972fd7aed336ff03bb6f31f5d9d09d941157f0bf0eebaf6653132b8920d26025353d"

RPROVIDES:${PN} += "nauty \
nauty(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libnauty-2.8.6.so()(64bit) \
libnautyL1-2.8.6.so()(64bit) \
libnautyW1-2.8.6.so()(64bit)"

inherit rpm
