SUMMARY = "A library to calculate python dependency graphs"
DESCRIPTION = "A library to calculate python dependency graphs."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "python310-importlab-0.8-1.4.noarch.rpm"
RPM_HASH = "8463db8d48c6e61f8fb146463602f5fbb9cd6e22ad20bb494a2945bbc714339a027375f52a3836b8d3aeb3980a4e565d749af5a0ea37e793b0592db1fdf93c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlab python3.10dist(importlab) python310-importlab python3dist(importlab)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-networkx update-alternatives"

inherit rpm
