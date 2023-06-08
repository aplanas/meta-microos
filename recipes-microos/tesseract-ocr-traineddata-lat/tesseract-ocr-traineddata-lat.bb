SUMMARY = "Latin language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Latin language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-lat-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "9c9d05a67a62d7868f1f6b0b2fbcb2bf5161533757eef816de64b4b768afd0c7e704552c6e4fa4652b92cb26f33dba17f85ec98fd934ff8b148fd06c4ead936e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-lat tesseract-ocr-traineddata-latin tesseract-traineddata-latin"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
