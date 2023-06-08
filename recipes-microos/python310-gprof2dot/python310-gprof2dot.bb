SUMMARY = "Script to generate a dot graph from the output of several profilers"
DESCRIPTION = "GProf2Dot.py is a Python script to convert the output from many \
profilers into a dot graph."
LICENSE = "LGPL-3.0-or-later"

PV = "2022.7.29"

RPM_NAME = "python310-gprof2dot-2022.7.29-1.4.noarch.rpm"
RPM_HASH = "46d2f755df28e9d4246efe1da34654fa4733528cfa29bf0b43b1558f903f9f9d5adefeeedbd362a5e7a6a279ce21a84e5f2634eb9a0226e07dc1d4f11a05bdca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gprof2dot python3.10dist(gprof2dot) python310-gprof2dot python3dist(gprof2dot)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
