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

RPM_NAME = "python310-Mako-1.2.4-1.4.noarch.rpm"
RPM_HASH = "d10bd83f61a6117e77687f5bec8a901092d4bfae1ff88c8cbbff40f791addc4597b4d3cc73f38fe065d58519cd5156a993f28b034a47a4961b12328861d6fac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Mako python3-mako python3.10dist(mako) python310-Mako python310-mako python3dist(mako)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 alts python(abi) python310-MarkupSafe python310-setuptools"

inherit rpm
