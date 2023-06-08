SUMMARY = "Python REPL build on top of prompt_toolkit - IPython support"
DESCRIPTION = "Ptpython is an advanced Python REPL. \
 \
This package provides IPython support to Ptpython."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python311-ptpython-ptipython-3.0.22-1.4.noarch.rpm"
RPM_HASH = "a1d0383579d9d8a56faecfbe4b45408944f701495c0ea5cafb736af7a0f68f552ae1bf18672b90b13370b31da65a6e52de88da4f282413cde2a4f4d2ebf1b9c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-ptpython-ptipython"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python311-ipython python311-ptpython"

inherit rpm
