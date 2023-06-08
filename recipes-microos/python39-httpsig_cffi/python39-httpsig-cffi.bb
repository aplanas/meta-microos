SUMMARY = "Secure HTTP request signing using the HTTP Signature draft specification"
DESCRIPTION = "Secure HTTP request signing using the HTTP Signature draft specification"
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "python39-httpsig_cffi-15.0.0-3.4.noarch.rpm"
RPM_HASH = "72dab3c05c4bed73fd8e9cef689db4945bed738fc9dfd6fbc5fe76401b7695ccd0916c0312ae8bb4e291bf0210b36b0d47a2ef7708b8dc5d1be2f9fc3dd4fa13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(httpsig-cffi) python39-httpsig_cffi python3dist(httpsig-cffi)"
RDEPENDS:${PN} += "python(abi) python39-cryptography python39-requests python39-six"

inherit rpm
