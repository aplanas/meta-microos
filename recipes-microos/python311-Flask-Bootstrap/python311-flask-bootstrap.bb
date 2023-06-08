SUMMARY = "An extension that includes Bootstrap in your project"
DESCRIPTION = "Flask-Bootstrap packages `Bootstrap \
<http://getbootstrap.com>`_ into an extension that mostly consists \
of a blueprint named 'bootstrap'. It can also create links to serve Bootstrap \
from a CDN and works with no boilerplate code in your application."
LICENSE = "BSD-2-Clause & Apache-2.0"

PV = "3.3.7.1"

RPM_NAME = "python311-Flask-Bootstrap-3.3.7.1-1.16.noarch.rpm"
RPM_HASH = "675b49569e58d6d383732d9ea91064f13d268b79642994b8a900c0d06383b9f849a8e4dbe3613962aaf32372ce57cc49ccc1a0635f62989c3986db29f028ed78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(flask-bootstrap) python311-Flask-Bootstrap python3dist(flask-bootstrap)"
RDEPENDS:${PN} += "python(abi) python311-Flask python311-dominate python311-visitor"

inherit rpm
