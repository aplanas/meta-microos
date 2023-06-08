SUMMARY = "Python wrapper for OCR engines"
DESCRIPTION = "PyOCR is an optical character recognition (OCR) tool wrapper for python. \
That is, it helps using various OCR tools from a Python program."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.3"

RPM_NAME = "python310-pyocr-0.8.3-1.3.noarch.rpm"
RPM_HASH = "38fe085f1477269fa96ee1c276c3c95df3a09e45e706e4a5f37b6a690d173755db56acd85217d30bac8b52b9db12fd7f8141ff049d241bcf01974260b6eef3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyocr python3.10dist(pyocr) python310-pyocr python3dist(pyocr)"
RDEPENDS:${PN} += "python(abi) python310-Pillow"

inherit rpm
