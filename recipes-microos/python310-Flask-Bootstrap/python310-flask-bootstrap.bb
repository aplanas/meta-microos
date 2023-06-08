SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "3.3.7.1"

RPM_NAME = "python310-Flask-Bootstrap-3.3.7.1-1.16.noarch.rpm"
RPM_HASH = "bd667c4770d9ba675ecb2d391e342124a3f670ce9488a72d758ed5de334ccce2f47d146e522f6c07a20d4a15696aaa9542203150dce7486538ce7d2662f551bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Flask-Bootstrap python3.10dist(flask-bootstrap) python310-Flask-Bootstrap python3dist(flask-bootstrap)"
RDEPENDS:${PN} += "python(abi) python310-Flask python310-dominate python310-visitor"

inherit rpm
