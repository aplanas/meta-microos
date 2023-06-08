SUMMARY = "jQuery repackaged for the XStatic standard"
DESCRIPTION = "jQuery javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "3.5.1.1"

RPM_NAME = "python310-XStatic-jQuery-3.5.1.1-1.3.aarch64.rpm"
RPM_HASH = "18f85899812fcee30e466eee8cce739486348a4e53d79ce0acc14d4b422ef571755394e031149016c44bc235d687949b1ff9bf628eaffdcf36a2261450b9c245"

RPROVIDES:${PN} += "python3-XStatic-jQuery python3.10dist(xstatic-jquery) python310-XStatic-jQuery python310-XStatic-jQuery(aarch-64) python3dist(xstatic-jquery)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
