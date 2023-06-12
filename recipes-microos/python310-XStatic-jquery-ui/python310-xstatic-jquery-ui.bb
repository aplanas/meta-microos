SUMMARY = "jQuery UI repackaged for the XStatic standard"
DESCRIPTION = "jquery-ui javascript library packaged for setuptools (easy_install) / pip. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "1.13.0.1"

RPM_NAME = "python310-XStatic-jquery-ui-1.13.0.1-1.8.noarch.rpm"
RPM_HASH = "cced85cc7498555a0a6ce573575ddc6eb732ab6eae2d80edf3d13fed50b3344cd0faa71e25724eb9ae02544644c5bce435782a1d1e51c25146c7f27d7b4cbebe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-XStatic-jquery-ui \
python3.10dist(xstatic-jquery-ui) \
python310-XStatic-jquery-ui \
python3dist(xstatic-jquery-ui)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
