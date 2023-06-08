SUMMARY = "LAMMPS data"
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
This subpackage contains LAMMPS's potential files"
LICENSE = "GPL-2.0-only & GPL-3.0-or-later"

PV = "20201029"

RPM_NAME = "lammps-data-20201029-4.3.noarch.rpm"
RPM_HASH = "605fd13c2dc6686e9e24e867f3ccd5ea2822346b49ceb223763ceb8cb4a51dcd4086f65c2c58b615daeb428de6d12debe02f37a7cf29cde6f859add7051907a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(lammps-data) lammps-data"
RDEPENDS:${PN} += ""

inherit rpm
