SUMMARY = "AngularJS library 'term.js' repackaged for the XStatic standard"
DESCRIPTION = "term.js javascript library packaged for setuptools (easy_install) / pip. \
There are otherwise no changes. \
 \
* term.js project: `Github chjj/term.js <https://github.com/chjj/term.js>`_ \
* XStatic package: `Github takluyver/XStatic-termjs <https://github.com/takluyver/XStatic-termjs>`_ \
 \
You can find more info about the xstatic packaging way in the package `XStatic`."
LICENSE = "MIT"

PV = "0.0.7.0"

RPM_NAME = "python39-XStatic-term.js-0.0.7.0-1.15.aarch64.rpm"
RPM_HASH = "dc55d3d4cfde3ed227614573a503441864099cec1d1a7d233bd909d3cd98a2177d634732ffd80d5a001962dd5a154d7f8249f6b7790362d2ee0bd76bf5bbc94d"

RPROVIDES:${PN} += "python3.9dist(xstatic-term.js) python39-XStatic-term.js python39-XStatic-term.js(aarch-64) python3dist(xstatic-term.js)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
