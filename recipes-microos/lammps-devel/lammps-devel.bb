SUMMARY = "Development headers and libraries for LAMMPS"
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
This package contains development headers and libraries for LAMMPS."
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "lammps-devel-20201029-4.3.aarch64.rpm"
RPM_HASH = "145bf8b93b439b1ec8ff869a517cc9a8c8cc897d9f06c68bf03bea09969a57fa163d5291e8f46bb0fb97dce361912ff3e65150191e98b09147bab36c2d1a5765"

RPROVIDES:${PN} += "cmake(LAMMPS) lammps-devel lammps-devel(aarch-64) pkgconfig(liblammps)"
RDEPENDS:${PN} += "/usr/bin/pkg-config lammps liblammps0"

inherit rpm
