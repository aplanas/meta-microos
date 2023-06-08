SUMMARY = "Sanskrit language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Sanskrit language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-san-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "872df16bf96bcef8a254c22ba58c9e000151d6d56559504f9ae1c5ad744ffe76feeff8936d662a8a88fcbe6570b27f1a300b61104fb600001f7abac105324f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-san tesseract-ocr-traineddata-sanskrit tesseract-traineddata-sanskrit"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
