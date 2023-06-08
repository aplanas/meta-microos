SUMMARY = "LAMMPS python module"
DESCRIPTION = "LAMMPS is a classical molecular dynamics code, and an acronym for Large-scale \
Atomic/Molecular Massively Parallel Simulator. \
 \
LAMMPS has potentials for soft materials (biomolecules, polymers) and \
solid-state materials (metals, semiconductors) and coarse-grained or \
mesoscopic systems. It can be used to model atoms or, more generically, as a \
parallel particle simulator at the atomic, meso, or continuum scale. \
 \
LAMMPS runs on single processors or in parallel using message-passing \
techniques and a spatial-decomposition of the simulation domain. The code is \
designed to be easy to modify or extend with new functionality. \
 \
This subpackage contains LAMMPS's Python module."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "python3-lammps-20201029-4.3.aarch64.rpm"
RPM_HASH = "a6257f587cf5973c4cf39cfbf6e6f9e58cc036309b2398ce4f8e40c45ee1e75d4ec666dfb4d33898095e1b6d1316ed4c9fc72986a43e7ac15d15d01d65e5f029"

RPROVIDES:${PN} += "python-lammps:/usr/lib64/python3.10/site-packages/lammps.py python3-lammps python3-lammps(aarch-64)"
RDEPENDS:${PN} += "liblammps0 python(abi)"

inherit rpm
