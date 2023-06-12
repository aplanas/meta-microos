SUMMARY = "Turns CSS blocks into style attributes"
DESCRIPTION = "Premailer is a Python library based on libxml which can analyze a \
HTML document and extract its CSS style sheets and then for all \
CSS seletors defined, it finds the DOM nodes and puts style \
attributes in instead."
LICENSE = "Python-2.0"

PV = "3.10.0"

RPM_NAME = "python39-premailer-3.10.0-1.3.noarch.rpm"
RPM_HASH = "a5d8a314b1f092eea43c556de0a5cef81aff46b0f00783fbe97b9b6e910f0698e24d49fcbcc24cf6e9a211e8fac2e01e282c56416b45dda45c28de75bf06200e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(premailer) \
python39-premailer \
python3dist(premailer)"
RDEPENDS:${PN} += "python(abi) \
python39-cachetools \
python39-cssselect \
python39-cssutils \
python39-lxml \
python39-requests"

inherit rpm
