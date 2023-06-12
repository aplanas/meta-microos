SUMMARY = "Python REPL build on top of prompt_toolkit"
DESCRIPTION = "Ptpython is an advanced Python REPL."
LICENSE = "ISC"

PV = "3.0.22"

RPM_NAME = "python311-ptpython-3.0.22-1.4.noarch.rpm"
RPM_HASH = "dd303b6afdfc501e644facc9421811b89dba4485c18f7016397b285420ac939a0abeef6c30be3a44436fdd4f052a690ec853f881b23a8ced562905f40c64496a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(ptpython) \
python311-ptpython \
python3dist(ptpython)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Pygments \
python311-appdirs \
python311-docopt \
python311-jedi \
python311-prompt_toolkit"

inherit rpm
