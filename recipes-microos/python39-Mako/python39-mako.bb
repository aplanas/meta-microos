SUMMARY = "A Python templating language"
DESCRIPTION = "Mako is a template library written in Python. It provides a non-XML \
syntax which compiles into Python modules for performance. Mako's \
syntax and API borrows from Django templates, Cheetah, Myghty, and \
Genshi. Conceptually, Mako is an embedded Python (i.e. Python Server \
Page) language, which refines the ideas of componentized layout and \
inheritance, while maintaining close ties to Python calling and \
scoping semantics."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "python39-Mako-1.2.4-1.4.noarch.rpm"
RPM_HASH = "d8b9c9b0951e3eff1d648008d10ca405dfe4d21f3dba301babc1e3a9754530871e0d888ad4ea0add617df5018016f9d9de95db3c1b0c2e5cf94e40ca85627fed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mako) \
python39-Mako \
python39-mako \
python3dist(mako)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-MarkupSafe \
python39-setuptools"

inherit rpm
