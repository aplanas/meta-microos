SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2022.7.29"

RPM_NAME = "python311-gprof2dot-2022.7.29-1.4.noarch.rpm"
RPM_HASH = "3c4ad0d0549e38fd67fa240fba9a480e5f5b1a2d840e8fc866ff4ab163272af5e236573803c78c1fb7b2d3db2de987fe3f4a3d1a04906b864f0a46549eee4077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gprof2dot) python311-gprof2dot python3dist(gprof2dot)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
