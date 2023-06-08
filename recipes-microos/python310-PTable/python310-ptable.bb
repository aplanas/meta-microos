SUMMARY = "Python library for displaying data as tabular ASCII"
DESCRIPTION = "Python library for displaying tabular data in an ASCII table format."
LICENSE = "BSD-3-Clause"

PV = "0.9.2"

RPM_NAME = "python310-PTable-0.9.2-2.11.noarch.rpm"
RPM_HASH = "dae17038c94906d9c0e56fa3dc6ea2e189d419b2edb7286c7c43a7a2510774348b0e482c415268c22d5306afb78f32f7bf3eeb36746a244b9a53acf799a3d29a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PTable python3.10dist(ptable) python310-PTable python3dist(ptable)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi)"

inherit rpm
