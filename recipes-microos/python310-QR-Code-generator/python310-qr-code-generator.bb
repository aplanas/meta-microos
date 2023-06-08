SUMMARY = "QR Code generator library"
DESCRIPTION = "This project aims to be the best, clearest QR Code generator library in multiple languages. \
The primary goals are flexible options and absolute correctness. \
Secondary goals are compact implementation size and good documentation comments."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-QR-Code-generator-1.6.0-1.12.aarch64.rpm"
RPM_HASH = "a60fdc93baf4e98a772e0fca6aacee923a43a6c25b722933226a5fbc71ff4570e6eab88f3fe64e33542584e9edc9eddcaab2c4895f36dfd6a5a8c26596f30549"

RPROVIDES:${PN} += "python3-QR-Code-generator python3.10dist(qrcodegen) python310-QR-Code-generator python310-QR-Code-generator(aarch-64) python3dist(qrcodegen)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
