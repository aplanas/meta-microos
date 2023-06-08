SUMMARY = "Galician language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Galician language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-glg-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "12dd5876a15966377e5dec3aa59b20b1041de532a3aacc74a5b1e791b7c309d8cece91102221c0df763c2009b6a8ba6b7380cd0425752d0b6b5a582985463e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-galician tesseract-ocr-traineddata-glg tesseract-traineddata-galician"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
