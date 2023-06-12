SUMMARY = "A library for making charts with Python"
DESCRIPTION = "Pycha is a Python package for drawing charts using the Cairo library. \
It will not try to draw any possible chart on Earth, but draw the \
most common ones nicely. Pycha is based on the Plotr which is based on \
PlotKit, both of which are written in JavaScript and are for client \
web programming. Pycha was developed for the server side."
LICENSE = "LGPL-3.0-or-later"

PV = "0.8.1"

RPM_NAME = "python311-pycha-0.8.1-3.1.noarch.rpm"
RPM_HASH = "bea54b72f2bda1caaf3872c5175cae481f0631ad3f58d7644c321d8653f9480332122027feed633ea499ba77e773947c2f76b1796308d3a7c765d4b2986ae955"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pycha) \
python311-pycha \
python3dist(pycha)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-cairocffi \
update-alternatives"

inherit rpm
