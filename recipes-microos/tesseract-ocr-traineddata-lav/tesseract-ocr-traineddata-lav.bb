SUMMARY = "Latvian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Latvian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-lav-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "20b3e5ac590361624f15e45900ab7f5597fbeaee8a41329c7c61f7d3b21c45f646b958b535daa4e2bed4c0bfae31aeaf6d103c330c74402e96fc4305542e977a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-latvian tesseract-ocr-traineddata-lav tesseract-traineddata-latvian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
