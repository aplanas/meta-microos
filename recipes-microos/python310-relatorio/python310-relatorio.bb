SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python310-relatorio-0.10.1-1.6.noarch.rpm"
RPM_HASH = "5eb7990ea87bb209328220095dc3c2125d0c3bd3efd36d824a326cc2c3f9dfb53fbfe633edaf838f300e461745524dedf2b30c47db0518fa3813b38c5605da1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-relatorio python3.10dist(relatorio) python310-relatorio python3dist(relatorio)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-Genshi python310-PyYAML python310-lxml python310-pycha python310-python-magic update-alternatives"

inherit rpm
