SUMMARY = "PDF file reader/writer library"
DESCRIPTION = "pdfrw is a Python library and utility that reads and writes PDF files."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "python310-pdfrw-0.4-3.16.noarch.rpm"
RPM_HASH = "1b1362c50a520d3a5d5d6c0c9077bae1510c6fc44f22fe217883c2fde2d5b61e3c7e1764b59b4cfd7af936ca3dac8bd2f86929e0b36269f065f091185456ce6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdfrw \
python3.10dist(pdfrw) \
python310-pdfrw \
python3dist(pdfrw)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
