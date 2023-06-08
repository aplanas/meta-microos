SUMMARY = "Lithuanian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Lithuanian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-lit-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "8adcd94b93806f131ddb787cf9fb21a62d3e138f64a493a7040b6d1dadcd51b6ed445c06993a40484e2fc5410d9bf88920bcebd13eeb550528d68ba994b593c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-lit tesseract-ocr-traineddata-lithuanian tesseract-traineddata-lithuanian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
