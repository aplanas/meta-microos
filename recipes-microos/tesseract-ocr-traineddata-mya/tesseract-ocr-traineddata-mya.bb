SUMMARY = "Burmese language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Burmese language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mya-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "2499ffbc36e6ca249122b9bdf6ccc39a491967ab50ea86fdc97e6464415cc29234a57dba6b6ad41938bd607a120bac8c666006e54525a64266af16f924da81f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-burmese tesseract-ocr-traineddata-mya tesseract-traineddata-burmese"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
