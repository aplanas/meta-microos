SUMMARY = "Python API for the gmsh mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the public gmsh API for Python."
LICENSE = "GPL-2.0-or-later"

PV = "4.11.1"

RPM_NAME = "python3-gmsh-4.11.1-2.1.noarch.rpm"
RPM_HASH = "83ed5560160839ece7ed8f8fdc88e4b267914b9a7781c9347afe693b775f9a5161f9f905189363526acdd764cf58d96461ac166a6d8cf5f0d17fc4c7e57edcc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gmsh python3.10dist(gmsh) python3dist(gmsh)"
RDEPENDS:${PN} += "libgmsh4_11 python(abi)"

inherit rpm
