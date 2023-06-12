SUMMARY = "Development package for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides the header and source files for development with \
pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "pythia-devel-8.307-1.14.aarch64.rpm"
RPM_HASH = "4830c0889e5ebc578cd2c519271f10b0a2cd9ae895d04b9c3ce7138edd1c13eef4c77c02bfc59e395ebab18e0880a5e8277cf12909e60aa0d36d2a9a561dc350"

RPROVIDES:${PN} += "config(pythia-devel) \
pythia-devel \
pythia-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
libpythia8 \
libpythia8lhapdf6"

inherit rpm
