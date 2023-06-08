SUMMARY = "RAR Archive Reader for Python"
DESCRIPTION = "This is a Python module for RAR archive reading. It supports both RAR \
2.x and 3.x archives, multi volume archives, Unicode filenames, \
password-protected archives, archive and file comments. The archive \
parsing and non-compressed files are handled in pure Python code, for \
compressed files, the 'unrar' utility is run."
LICENSE = "ISC"

PV = "4.0"

RPM_NAME = "python39-rarfile-4.0-3.5.noarch.rpm"
RPM_HASH = "94e668b81dc224943c1162edae28860d4397a785a10127c37af50dae800eff032ac2c655c4be9abf72ac86cda80c14eab88b05b652615b39edac8680b379ab77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rarfile) python39-rarfile python3dist(rarfile)"
RDEPENDS:${PN} += "bsdtar python(abi)"

inherit rpm
