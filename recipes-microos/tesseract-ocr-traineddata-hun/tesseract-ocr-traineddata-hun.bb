SUMMARY = "Hungarian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Hungarian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-hun-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "6dc782ab1e884dbd8ae521585e64a62ab114a6a45ae0bc4826a853e7b5f12bfc90cbe7275a74ed554bf2850795340ff4d4bd77e9f9f43232134cac5690d431b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-hun tesseract-ocr-traineddata-hungarian tesseract-traineddata-hungarian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
