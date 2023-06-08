SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python311-docrepr-0.1.1-2.16.noarch.rpm"
RPM_HASH = "7e89503120a97b7b740dfa08b1015babe4ccef5513873a9bb819702b4dd8f0f1129fd44c4e795ad20e44fda430b552497eb0e1b5c21cb56b18916ceb8325ff1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(docrepr) python311-docrepr python3dist(docrepr)"
RDEPENDS:${PN} += "python(abi) python311-Jinja2 python311-Sphinx python311-docutils"

inherit rpm
