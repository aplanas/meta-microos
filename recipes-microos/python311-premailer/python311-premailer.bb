SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python311-premailer-3.10.0-1.3.noarch.rpm"
RPM_HASH = "8eac0b5f17174f4309456f3b95cd7ef1c1fe67d641a24f82fed324313b0707675b0e59f4b41d7ad9d263285b6f9c95e60d9ab247f3560baeeb829469fea78de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(premailer) python311-premailer python3dist(premailer)"
RDEPENDS:${PN} += "python(abi) python311-cachetools python311-cssselect python311-cssutils python311-lxml python311-requests"

inherit rpm
