SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python311-pdfrw-0.4-3.16.noarch.rpm"
RPM_HASH = "afe9f7b5bacc80e84833a92171a87e752652d0c13c23144a01fdcad9808d4288e9117607db33a3e1e9f4fa879a73bc0a72f7189560075ab417a36e8163521ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pdfrw) python311-pdfrw python3dist(pdfrw)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
