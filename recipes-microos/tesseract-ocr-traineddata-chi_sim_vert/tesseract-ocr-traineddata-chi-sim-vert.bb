SUMMARY = "Chinese (Simplified, Vertical) language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Chinese (Simplified, Vertical) language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-chi_sim_vert-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "7442e75f27e19ca77dec034a615e5f92f748afe80aafaa442519f3a2bb8dd85507591e4630d13318c3afaaaf387e28e2f1a19a44edd71562a39e94fa1bfa5efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-chi_sim_vert tesseract-ocr-traineddata-chinese_simplified_vertical tesseract-traineddata-chinese_simplified_vertical"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
