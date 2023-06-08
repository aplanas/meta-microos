SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.7.0"

RPM_NAME = "python311-vistir-0.7.0-1.3.noarch.rpm"
RPM_HASH = "b1d1094475a6fbe49d19c2fefce6fe6f7304ce729914fa57c5d03f1d50877a38c9faa451ef76743146d536f8e2cdae48618fcc94b3f46acc3c2a27d10528d9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(vistir) python311-vistir python3dist(vistir)"
RDEPENDS:${PN} += "python(abi) python311-colorama"

inherit rpm
