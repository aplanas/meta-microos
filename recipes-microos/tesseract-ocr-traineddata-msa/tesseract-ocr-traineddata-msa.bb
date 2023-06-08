SUMMARY = "Malay language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Malay language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-msa-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "c2000def5d9c81fe0744204e9cc11da55fc3368d4752e0536395a6f5b1b7356f4bf282b31ad324baca88b56fd1e2c8f0ab45dc7f2990b9d9569b3016ac610909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-malay tesseract-ocr-traineddata-msa tesseract-traineddata-malay"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
