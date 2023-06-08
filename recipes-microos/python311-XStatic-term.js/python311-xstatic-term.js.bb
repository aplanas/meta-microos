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

RPM_NAME = "python311-XStatic-term.js-0.0.7.0-1.15.aarch64.rpm"
RPM_HASH = "4a362e6a4acfb09b57b5135209aa9f0bf16da4842271179bd2e8eb694e4f97a4f0c9190a1dec34fd36c3b223297238ad8ba53339d2a1cead73be98491199c1fc"

RPROVIDES:${PN} += "python3.11dist(xstatic-term.js) python311-XStatic-term.js python311-XStatic-term.js(aarch-64) python3dist(xstatic-term.js)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
