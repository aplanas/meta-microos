SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "10.4.1"

RPM_NAME = "python310-dropbox-10.4.1-2.8.noarch.rpm"
RPM_HASH = "d5ccf2705412803acc2b9b34ab7329f8541fa45759a9b36dc0dfba318a1d9aa36501b7d47778623b52cb13914c4474d7865240927484d94840c0e40d5221cd0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dropbox \
python3.10dist(dropbox) \
python310-dropbox \
python3dist(dropbox)"
RDEPENDS:${PN} += "python(abi) \
python310-requests \
python310-six"

inherit rpm
