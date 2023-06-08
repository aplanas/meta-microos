SUMMARY = "Macedonian language data for tesseract-ocr-traineddata"
DESCRIPTION = "This package contains the fast integer version of the Macedonian language \
trained models for the Tesseract Open Source OCR Engine."
LICENSE = "Apache-2.0"

PV = "4.1.0+git.20191030.6572757"

RPM_NAME = "tesseract-ocr-traineddata-mkd-4.1.0+git.20191030.6572757-2.1.noarch.rpm"
RPM_HASH = "dde5c1727b7a317cf56bba244581b3c99bbb004935d2761ab483e386009e4304c574110b6efb36a66cdf366bca85927bb8a568bd45af821fb710558f632c54e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tesseract-ocr-traineddata-macedonian tesseract-ocr-traineddata-mkd tesseract-traineddata-macedonian"
RDEPENDS:${PN} += "tesseract-ocr"

inherit rpm
