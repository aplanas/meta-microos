SUMMARY = "Spanish (Old) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Spanish (Old) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-spa_old-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "b53bddc883c7bcc0192f7b04b4f47e8113d98056d1bcde14cffb40149c968dbb239a34810394b20a594a8b8e413bdde93c45e9939538ed84b6874bdb07e1b675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-spa_old \
tesseract-ocr-traineddata-spanish_old \
tesseract-traineddata-spanish_old"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
