SUMMARY = "Khmer script data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Khmer script \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-script-khmer-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f9f102a07b22d39db3e9fda1e59de6986a86c1d4c6aeab7defe347c60b1a7607383b944122a6fb79163915633b952f6516a69ea629d0eb633914ca2cadb55e7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-script-khmer"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
