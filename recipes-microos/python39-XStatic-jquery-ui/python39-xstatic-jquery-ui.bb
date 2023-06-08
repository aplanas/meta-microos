SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python39-XStatic-jquery-ui-1.13.0.1-1.8.noarch.rpm"
RPM_HASH = "bbab9883219319d2f9086ac2b40faf57ed0f5ca92d03b8a781db0820990a2c2eb736964e220fdef9c1beb8569a82a2e0e3c8c470b5158d10eb3996861a5897dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xstatic-jquery-ui) python39-XStatic-jquery-ui python3dist(xstatic-jquery-ui)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
