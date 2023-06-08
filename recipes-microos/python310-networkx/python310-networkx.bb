SUMMARY = "Python package for the study of complex networks"
DESCRIPTION = "NetworkX (NX) is a Python package for the creation, manipulation, and study of the structure, dynamics, \
and functions of complex networks. \
 \
Features: \
 * Includes standard graph-theoretic and statistical physics functions \
 * Exchange of network algorithms between applications, disciplines, and platforms \
 * Includes many classic graphs and synthetic networks \
 * Nodes and edges can be 'anything' (e.g. time-series, text, images, XML records) \
 * Exploits existing code from high-quality legacy software in C, C++, Fortran, etc. \
 * Unit-tested"
LICENSE = "BSD-3-Clause"

PV = "2.8.8"

RPM_NAME = "python310-networkx-2.8.8-1.3.noarch.rpm"
RPM_HASH = "876c6ddc7232aae17d03e38da26ce169f0b6e3155c99ddab753aaf6a093bb1c29d0b40531267e8cf450760542af457e42060a58d15db544cd0a6cefa8604df05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-networkx python3.10dist(networkx) python310-networkx python3dist(networkx)"
RDEPENDS:${PN} += "python(abi) python310-matplotlib python310-numpy python310-pandas python310-scipy"

inherit rpm
