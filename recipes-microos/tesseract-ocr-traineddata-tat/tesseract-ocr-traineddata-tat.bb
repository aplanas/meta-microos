SUMMARY = "Tatar language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Tatar language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-tat-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "430751490ec331306d92e07e5865c999977896b0f06fbe153e2137cbb3d36acd2456a54d87b67a5e8e89e5fdc90253f9d724f1919991ff51744207666b4b339f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-tat tesseract-ocr-traineddata-tatar tesseract-traineddata-tatar"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
