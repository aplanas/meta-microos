SUMMARY = "Occitan language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Occitan language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-oci-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "acd0ff34730bfa622757509eb5512562c37fda7634fafcfdfb06f9499e710fda9628d7174706ee1f1bf41d553d33f68b6b6cb00587b430d509e2e93c09577574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-occitan tesseract-ocr-traineddata-oci tesseract-traineddata-occitan"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
