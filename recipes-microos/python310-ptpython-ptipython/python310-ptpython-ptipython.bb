SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python310-ptpython-ptipython-3.0.22-1.4.noarch.rpm"
RPM_HASH = "ff83d575d21adcfbb03936ad86883e8810e96b67452931ceac094bf4b030d4cfa6f81dd0b2dfcfd0b6cf9eba7407229172e54179bf9596ec360eedb0f238addd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ptpython-ptipython \
python310-ptpython-ptipython"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python310-ipython \
python310-ptpython"

inherit rpm
