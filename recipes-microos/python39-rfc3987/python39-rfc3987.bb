SUMMARY = "Module for parsing and validation of URIs (RFC 3986) and IRIs (RFC 3987)"
DESCRIPTION = "This module provides regular expressions according to `RFC 3986 'Uniform \
Resource Identifier (URI): Generic Syntax' \
<http://tools.ietf.org/html/rfc3986>`_ and `RFC 3987 'Internationalized \
Resource Identifiers (IRIs)' <http://tools.ietf.org/html/rfc3987>`_, and \
utilities for composition and relative resolution of references."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.8"

RPM_NAME = "python39-rfc3987-1.3.8-5.1.noarch.rpm"
RPM_HASH = "0412089feabcab30015e9e7124c209926d0d6524e48f0179356d5e3880023547d88b7f27e997788147d6f5a43cbca937b49c373e81e99c4006da3cabb6d8931f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(rfc3987) python39-rfc3987 python3dist(rfc3987)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
