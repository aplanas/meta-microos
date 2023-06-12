SUMMARY = "Documentation for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides documentation for development with pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.307"

RPM_NAME = "pythia-doc-8.307-1.14.aarch64.rpm"
RPM_HASH = "f65e88242a77b89bed185909508c9d7abc3921416e1abddf8b69d32a7e449cb795a3a4aba91410b6f0abaeeb35655044ae43c91ce4794a5139f1ca8b68daa824"

RPROVIDES:${PN} += "pythia-doc \
pythia-doc(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
