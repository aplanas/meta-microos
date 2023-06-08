SUMMARY = "Yoruba language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Yoruba language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-yor-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "f9eea5f166fff19573ccaed5e8e5757bad1c0b652b52a993ad4f5831ebcade0b6d75d2ef2a28342cf379b208f5f1427efa86c436f379e3cd908196f9cc2c37a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-yor tesseract-ocr-traineddata-yoruba tesseract-traineddata-yoruba"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
